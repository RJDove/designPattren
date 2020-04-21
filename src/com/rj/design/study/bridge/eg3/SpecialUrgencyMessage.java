package com.rj.design.study.bridge.eg3;

/**
 * 新的特急消息
 * @author renjin
 * @date 2020/1/14
 */
public class SpecialUrgencyMessage extends AbstractMessage {

    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void hurry(String messageId) {
        //执行催促的业务，发送催促的消息
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message += "特急：";
        super.sendMessage(message, toUser);
        //还需要增加一条特催促的信息
    }
}
