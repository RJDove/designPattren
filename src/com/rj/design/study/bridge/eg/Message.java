package com.rj.design.study.bridge.eg;

/**
 * 消息的统一接口
 * @author renjin
 * @date 2020/1/14
 */
public interface Message {

    /**
     * 发送消息
     * @param message
     * @param toUser
     */
    void send(String message, String toUser);
}
