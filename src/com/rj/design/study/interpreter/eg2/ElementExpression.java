package com.rj.design.study.interpreter.eg2;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素作为非终结符对应的解释器，解释并执行中间元素
 * @author renjin
 * @date 2020/1/10
 */
public class ElementExpression extends ReadXmlExpression {


    /**
     * 用来记录组合的ReadXmlExpression元素
     */
    private Collection<ReadXmlExpression> eles = new ArrayList<>();

    private String eleName;

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }

    public boolean removeEle(ReadXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }

    @Override
    public String[] interpret(Context c) {
        Element preEle = c.getPreEle();
        if (preEle == null) {
            c.setPreEle(c.getDocument().getDocumentElement());
        } else {
            Element nowEle = c.getNowEle(preEle, eleName);
            c.setPreEle(nowEle);
        }

        //循环调用子元素的interpret方法
        String[] ss = null;
        for (ReadXmlExpression ele : eles) {
            ss = ele.interpret(c);
        }
        return ss;
    }
}
