package com.rj.design.study.bridge.eg3;

/**
 * 加急消息实现
 * @author renjin
 * @date 2020/1/14
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message += "加急：";
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展自己的新功能，监控某消息的处理过程
     * @param messageId
     * @return
     */
    public Object watch(String messageId) {
        return null;
    }
}
