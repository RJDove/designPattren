package com.rj.design.study.mediator.eg;

import com.rj.design.study.mediator.Colleague;
import com.rj.design.study.mediator.Mediator;

/**
 * 声卡类，一个同事类
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     * @param data 发出声音的数据
     */
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }
}
