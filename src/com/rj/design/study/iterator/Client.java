package com.rj.design.study.iterator;

public class Client {

    public void someOperation() {
        String[] names = {"张三","李四","王五"};
        //创建聚合对象
        Aggregate aggregate = new ConcreteAggregate(names);
        //循环输出聚合对象中的值
        Iterator iterator = aggregate.createIterator();
        //首先设置迭代器到第一个元素
        iterator.first();
        while (!iterator.isDone()) {
            //取出当前的元素来
            Object obj = iterator.currentItem();
            System.out.println("the obj==" + obj);
            //如果还没有迭代到最后，那么就向下迭代一个
            iterator.next();
        }
    }

    public void test02() {
        int a = 100;
        a++;
        a--;
        System.out.println(a);
    }


    public static void main(String[] args) {
        //可以简单的测试下
        Client client = new Client();
        client.someOperation();
        client.test02();
    }
}
