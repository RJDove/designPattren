package com.rj.design.study.chainOfResponsibility.eg2;

/**
 * 具体的职责对象，用来处理请求
 * @author renjin
 * @date 2020/1/13
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest() {

        boolean someCondition = false;

        if (someCondition) {
            System.out.println("ConcreteHandler1 handler request");
        } else {
            if (this.successor != null) {
                this.successor.handleRequest();
            }
        }
    }
}
