package com.rj.design.study.bridge.eg3;

/**
 * @author renjin
 * @date 2020/1/14
 */
public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("以站E-mail的方式, 发送普通消息'" + message + "'给" + toUser);
    }
}
