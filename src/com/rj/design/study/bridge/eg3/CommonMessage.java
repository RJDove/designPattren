package com.rj.design.study.bridge.eg3;

/**
 * 普通消息的实现
 * @author renjin
 * @date 2020/1/14
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser) {
        //对于普通消息，什么都不干，直接调用父类的方法，把消息发送出去就可以
        super.sendMessage(message, toUser);
    }
}


