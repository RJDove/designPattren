package com.rj.design.study.prototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OderClient {
    public static void main(String[] args) throws ParseException {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderProductNum(2958);
        personalOrder.setCustomerName("张三");
        personalOrder.setProductId("P001");

        OrderBusiness orderBusiness = new OrderBusiness();
        orderBusiness.saveOrder(personalOrder);

        PersonalOrder personalOrder2 = new PersonalOrder();
        personalOrder2.setOrderProductNum(2950);
        personalOrder2.setCustomerName("李四");
        personalOrder2.setProductId("P002");
        personalOrder2.setNow(new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-15"));
        OrderBusiness2 orderBusiness2 = new OrderBusiness2();
        orderBusiness2.saveOrder(personalOrder2);
    }
}
