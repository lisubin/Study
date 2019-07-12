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
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();//获取实例
        String file="src/applicationContext.xml";//读取路径
        try {
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();//得到创建对象
            Document document = builder.parse(file);//解析文件
            NodeList bookList = document.getElementsByTagName("book");//根据标签名获取节点
            for (int i = 0; i < bookList.getLength(); i++) {
                Node node = bookList.item(i);
                NamedNodeMap attributes = node.getAttributes();
                System.out.println(attributes.item(0));//节点名称
                NodeList nodes = node.getChildNodes();
                for (int j = 1; j < nodes.getLength(); j+=2) {
                    Node item = nodes.item(j);
                    Map<String,String> map = new HashMap<>();
                    map.put(item.getNodeName(),item.getFirstChild().getTextContent());//节点名称，节点内的值
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
