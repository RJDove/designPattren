package com.rj.design.study.proxy;

/**
 * 代理对象
 */
public class Proxy implements Subject {

    /**
     * 持有被代理对象的具体的目标对象
     */
    private RealSubject realSubject = null;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //在转调具体的目标对象前，可以执行一些功能处理

        //转调具体的目标对象的方法
        realSubject.request();

        //在转掉具体的目标对象之后，可以执行一些功能处理
    }
}
