package com.rj.design.study.observer.eg3;


import java.util.Observable;

/**
 * 报纸对象，具体的目标实现--使用java先用的Observer
 *
 * @author renjin
 * @date 2020/1/21
 */
public class NewsPaper extends Observable {

    /**
     * 报纸的具体内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    /**
     * 示意，设置报纸的具体内容，相当于要出版报纸了
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;

        //内容更新，融通知所有的读者
        //注意在用java中的Observer模式的时候，下面这句话不可少
        this.setChanged();

        //然后主动通知，这里是用的推的方式
        this.notifyObservers(this.content);

        //如果使用拉的方式，这么调用
        //this.notifyObservers();
    }
}
