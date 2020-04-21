package com.rj.design.study.bridge.eg;

/**
 * 以站内短消息的方式发送普通消息
 * @author renjin
 * @date 2020/1/14
 */
public class CommonMessageSMS implements Message {


    @Override
    public void send(String message, String toUser) {
        System.out.println("以站内短消息的方式, 发送普通消息'" + message + "'给" + toUser );
    }
}
