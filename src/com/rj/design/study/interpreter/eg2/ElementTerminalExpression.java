package com.rj.design.study.interpreter.eg2;

import org.w3c.dom.Element;

/**
 * 元素作为终结符对应的解释器
 * @author renjin
 * @date 2020/1/10
 */
public class ElementTerminalExpression extends ReadXmlExpression{

    private String eleName = "";

    public ElementTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context c) {
        //先取出上下文中的当前元素作为父级元素
        Element preEle = c.getPreEle();
        Element ele;
        if (preEle == null) {
            ele = c.getDocument().getDocumentElement();
            c.setPreEle(ele);
        } else {
            ele = c.getNowEle(preEle, eleName);
            c.setPreEle(ele);
        }

        //获取这个元素的值
        String[] ss = new String[1];
        ss[0] = ele.getFirstChild().getNodeValue();
        return ss;
    }
}
