package com.rj.design.study.visitor.eg2;

/**
 * 被访问的元素的接口
 *
 * @author renjin
 * @date 2020/1/14
 */
public abstract class Element {

    /**
     * 接受访问者的访问
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
