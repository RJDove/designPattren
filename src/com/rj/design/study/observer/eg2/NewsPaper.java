package com.rj.design.study.observer.eg2;

/**
 * 报纸对象，具体的目标实现
 * @author renjin
 * @date 2020/1/21
 */
public class NewsPaper extends Subject {

    /**
     * 报纸的具体内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    /**
     * 示意，设置报纸的具体内容，相当于要出版报纸了
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
        //内容更新，融通知所有的读者
        this.notifyAllObservers();
    }
}
