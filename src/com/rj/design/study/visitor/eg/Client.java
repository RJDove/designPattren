package com.rj.design.study.visitor.eg;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author renjin
 * @date 2020/1/14
 */
public class Client {

    public static void main(String[] args) {
        Collection<Customer> customers = perparedTestData();
        customers.forEach(item -> {
            item.predilectionAnalyze();
            item.worthAnalyze();
        });
    }

    private static Collection<Customer> perparedTestData() {
        Collection<Customer> customers = new ArrayList<>();

        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        customers.add(cm1);
        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("DEF集团");
        customers.add(cm2);
        Customer cm3 = new PersonalCustomer();
        cm3.setName("张三");
        customers.add(cm3);
        return customers;
    }
}
