package com.rj.design.study.visitor.eg2;

/**
 * 访问者接口
 * @author renjin
 * @date 2020/1/14
 */
public interface Visitor {

    /**
     * 访问元素A，相当于给元素A添加访问者功能
     * @param elementA
     */
    void visitConcreteElementA(ConcreteElementA elementA);

    /**B
     * 访问元素B，相当于给元素A添加访问者功能
     * @param elementB
     */
    void visitConcreteElementB(ConcreteElementB elementB);
}
