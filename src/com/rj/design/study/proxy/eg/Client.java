package com.rj.design.study.proxy.eg;

public class Client {

    public static void main(String[] args) {
        OrderApi order = new OrderProxy(new Order("设计模式", 100, "张三"));
        order.setOrderNum(101,"李四");

    }
}
