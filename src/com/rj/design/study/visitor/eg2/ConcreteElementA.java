package com.rj.design.study.visitor.eg2;

/**
 * 具体元素的实现对象
 * @author renjin
 * @date 2020/1/14
 */
public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        //已有的功能实现
    }
}
