package com.rj.design.study.bridge.eg3;

/**
 * 以站内短消息的方式发送普通消息
 * @author renjin
 * @date 2020/1/14
 */
public class MessageSMS implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("以站内短消息的方式, 发送普通消息'" + message + "'给" + toUser );
    }
}
