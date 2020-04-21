package com.rj.design.study.chainOfResponsibility.eg2;

/**
 * @author renjin
 * @date 2020/1/13
 */
public class Client {

    public static void main(String[] args) {
        //先要组装职责链
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler1();

        h1.setSuccessor(h2);
        h1.handleRequest();
    }
}
