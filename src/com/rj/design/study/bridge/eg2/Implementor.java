package com.rj.design.study.bridge.eg2;

/**
 * 定义实现部分的接口，可以与抽象部分接口的方法不一样
 * @author renjin
 * @date 2020/1/14
 */
public interface Implementor {

    /**
     * 示例方法，实现抽象部分需要的某些具体功能
     */
    void operationImpl();
}
