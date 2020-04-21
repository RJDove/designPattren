package com.rj.design.study.visitor.eg2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 对象结构，通常在这里对元素对象进行遍历，让访问者能访问到所有的元素
 * @author renjin
 * @date 2020/1/14
 */
public class ObjectStructure {

    /**
     * 表示对象结构，可以是一个组合结构或者集合
     */
    private Collection<Element> col = new ArrayList<>();

    /**
     * 提供给客户端操作的高层接口
     * @param visitor
     */
    public void handleRequest(Visitor visitor) {
        for (Element ele : col) {
            ele.accept(visitor);
        }
    }

    /**
     * 向对象结构中添加元素
     * @param ele
     */
    public void addElement(Element ele) {
        this.col.add(ele);
    }
}
