package com.rj.design.study.chainOfResponsibility.eg2;

/**
 * 职责接口，也就是处理请求的接口
 * @author renjin
 * @date 2020/1/13
 */
public abstract class Handler {

    /**
     * 持有后续的职责对象
     */
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 示意处理请求的方法
     */
    public abstract void handleRequest();
}
