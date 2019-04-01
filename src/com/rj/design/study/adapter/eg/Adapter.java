package com.rj.design.study.adapter.eg;

/**
 * 适配器
 */
public class Adapter implements Target{

    /**
     * 持有需要被适配的接口的对象
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 示意方法，客户端请求处理的方法
     */
    @Override
    public void request() {
        //调用已经实现的方法，进行适配
        adaptee.specificRequest();
    }
}

