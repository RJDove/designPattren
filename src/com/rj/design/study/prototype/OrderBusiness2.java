package com.rj.design.study.prototype;

public class OrderBusiness2 {

    public void saveOrder(OrderApi order) {
        while(order.getOrderProductNum() > 1000) {
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            System.out.println("拆分生成订单==" + newOrder);
        }
        //3.不超过1000，那就直接业务功能处理，省略了
        System.out.println("订单==" + order);
    }
}
