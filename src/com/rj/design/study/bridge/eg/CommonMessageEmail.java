package com.rj.design.study.bridge.eg;

/**
 * 以E-mail的方式发送普通消息
 *
 * @author renjin
 * @date 2020/1/14
 */
public class CommonMessageEmail implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println("以站E-mail的方式, 发送普通消息'" + message + "'给" + toUser);
    }
}
