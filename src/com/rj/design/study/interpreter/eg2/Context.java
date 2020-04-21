package com.rj.design.study.interpreter.eg2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 上下文
 * @author renjin
 * @date 2020/1/10
 */
public class Context {

    /**
     * 上次被处理的元素
     */
    private Element preEle;

    /**
     * Dom解析xml的Document对象
     */
    private Document document;

    public Context(String filePathName) throws Exception {
        this.document = XmlUtil.getRoot(filePathName);
    }

    public void reInit() {
        preEle = null;
    }

    public Element getNowEle(Element pEle, String eleName) {
        NodeList tempNodeList = pEle.getChildNodes();
        for (int i=0; i<tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                Element nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    return nowEle;
                }
            }
        }
        return null;
    }

    public Element getPreEle() {
        return preEle;
    }

    public void setPreEle(Element preEle) {
        this.preEle = preEle;
    }

    public Document getDocument() {
        return document;
    }

}
