package com.rj.design.study.proxy.dynamic;

import com.rj.design.study.proxy.eg.Order;
import com.rj.design.study.proxy.eg.OrderApi;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("设计模式", 100, "张三");
        DynamicProxy dynamicProxy = new DynamicProxy();
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);
        orderApi.setOrderNum(101, "张三");
        System.out.println(orderApi.getOrderUser());
    }
}
