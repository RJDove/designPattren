package com.rj.design.study.visitor.eg3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author renjin
 * @date 2020/1/15
 */
public class ObjectStructure {

    /**
     * 要操作的客户集合
     */
    private Collection<Customer> col = new ArrayList<>();

    /**
     * 提供给客户端操作的高层接口，具体的功能有客户端传入的访问者决定
     * @param visitor
     */
    public void handleRequest(Visitor visitor) {
        for (Customer customer : col) {
            customer.accept(visitor);
        }
    }

    /**
     * 组建对象结构，向对象结构中添加元素
     * @param ele
     */
    public void addElement(Customer ele) {
        this.col.add(ele);
    }
}
