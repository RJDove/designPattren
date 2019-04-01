package com.rj.design.study.adapter.eg;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/3/27
 * @modifyBy
 */
public class Client {

    public static void main(String[] args) {
        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        //请求处理
        target.request();
    }
}
