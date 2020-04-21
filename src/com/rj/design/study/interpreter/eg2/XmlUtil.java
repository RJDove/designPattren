package com.rj.design.study.interpreter.eg2;


import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author renjin
 * @date 2020/1/10
 */
public class XmlUtil {

    public static Document getRoot(String filePathName) throws Exception {
        Document doc;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.parse(filePathName);
        //去掉xml文件中作为格式化内容的空白而映射在Dom树中的TextNode对象
        doc.normalize();
        return doc;
    }
}
