package com.rj.design.study.bridge.eg3;

/**
 * 以手机短消息的方式发送消息
 * @author renjin
 * @date 2020/1/14
 */
public class MessageMobile implements MessageImplementor{

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式, 发送普通消息'" + message + "'给" + toUser );
    }
}
