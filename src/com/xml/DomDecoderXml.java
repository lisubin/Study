package com.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DomDecoderXml {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();//��ȡʵ��
        String file="src/applicationContext.xml";//��ȡ·��
        try {
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();//�õ���������
            Document document = builder.parse(file);//�����ļ�
            NodeList bookList = document.getElementsByTagName("book");//���ݱ�ǩ����ȡ�ڵ�
            for (int i = 0; i < bookList.getLength(); i++) {
                Node node = bookList.item(i);
                NamedNodeMap attributes = node.getAttributes();
                System.out.println(attributes.item(0));//�ڵ�����
                NodeList nodes = node.getChildNodes();
                for (int j = 1; j < nodes.getLength(); j+=2) {
                    Node item = nodes.item(j);
                    Map<String,String> map = new HashMap<>();
                    map.put(item.getNodeName(),item.getFirstChild().getTextContent());//�ڵ����ƣ��ڵ��ڵ�ֵ
                    System.out.println(map);
                }
//                System.out.println(nodes.item(1).getFirstChild().getTextContent());
            } } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
