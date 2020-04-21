package com.rj.design.study.bridge.eg3;

/**
 * 实现发送消息的统一接口
 * @author renjin
 * @date 2020/1/14
 */
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message
     * @param toUser
     */
    void send(String message, String toUser);
}
