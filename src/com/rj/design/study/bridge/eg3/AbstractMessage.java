package com.rj.design.study.bridge.eg3;

/**
 * 抽象的消息对象
 * @author renjin
 * @date 2020/1/14
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，转调实现部分的方法
     * @param message
     * @param toUser
     */
    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}
