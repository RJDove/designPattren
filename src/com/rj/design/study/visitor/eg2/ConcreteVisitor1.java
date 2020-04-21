package com.rj.design.study.visitor.eg2;

/**
 * 具体的访问者实现
 * @author renjin
 * @date 2020/1/14
 */
public class ConcreteVisitor1 implements Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA element) {
        //把要访问ConcreteElementA，需要执行的功能实现放在这里
        element.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB element) {
        //把要访问ConcreteElementA，需要执行的功能实现放在这里
        element.operationB();
    }
}
