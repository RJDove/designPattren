package com.rj.design.study.iterator;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("renjin","24","shenzhen");
        Person p2 = p1;
        p1.setName("zhangsan");
        System.out.println(p1);
        System.out.println(p2);
    }
}
