package com.rj.design.study.mediator.eg;

import com.rj.design.study.mediator.Colleague;
import com.rj.design.study.mediator.Mediator;

/**
 * CPU类，一个同事类
 */
public class CPU extends Colleague {

    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 分解出来的视频数据
     */
    private String videoData = "";

    /**
     * 分解出来的声音数据
     */
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data) {
        //把数据分解开，前面是视频数据，后面的是音频数据
        String[] ss = data.split(",");
        this.videoData = ss[0];
        this.soundData = ss[1];
        //通知主板，CPU的工作完成
        this.getMediator().changed(this);
    }
}
