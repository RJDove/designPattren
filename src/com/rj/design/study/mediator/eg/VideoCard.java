package com.rj.design.study.mediator.eg;

import com.rj.design.study.mediator.Colleague;
import com.rj.design.study.mediator.Mediator;

/**
 * 显卡类，一个同事类
 */
public class VideoCard extends Colleague {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("您正在观看的是：" + data);
    }
}
