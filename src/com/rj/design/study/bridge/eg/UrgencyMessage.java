package com.rj.design.study.bridge.eg;

/**
 * 加急消息的抽象接口
 * @author renjin
 * @date 2020/1/14
 */
public interface UrgencyMessage extends Message {

    /**
     * 监控某消息的处理过程
     * @param messageId
     * @return
     */
    Object watch(String messageId);
}
