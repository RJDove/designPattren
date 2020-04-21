package com.rj.design.study.bridge.eg;

/**
 * 加急处理
 * @author renjin
 * @date 2020/1/14
 */
public class UrgencyMessageEmail implements UrgencyMessage {

    @Override
    public Object watch(String messageId) {
        //获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }

    @Override
    public void send(String message, String toUser) {
        message += "加急：";
        System.out.println("以站E-mail的方式, 发送普通消息'" + message + "'给" + toUser);
    }
}
