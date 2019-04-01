package com.rj.design.study.mediator.eg;

import com.rj.design.study.mediator.Colleague;
import com.rj.design.study.mediator.Mediator;

/**
 * 光驱类，一个同事类
 */
public class CDDriver extends Colleague {

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 光驱中读取出来的数据
     */
    private String data = "";

    /**
     * 获取光驱中的数据
     * @return 光驱中读取出来的数据
     */
    public String getData() {
        return data;
    }

    /**
     * 读取光盘
     */
    public void readCD() {
        //前面是声音数据，后面是视频数据
        this.data = "设计模式,值得好好研究";
        //通知主板，自己的状态发生了改变
        this.getMediator().changed(this);
    }
}
