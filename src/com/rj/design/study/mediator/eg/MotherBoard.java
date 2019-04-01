package com.rj.design.study.mediator.eg;

import com.rj.design.study.mediator.Colleague;
import com.rj.design.study.mediator.Mediator;

public class MotherBoard implements Mediator {
    /**
     * 交互的同事类-光驱类
     */
    private CDDriver cdDriver = null;

    /**
     * 交互的同事类-cpu类
     */
    private CPU cpu = null;

    /**
     * 交互的同事类-显卡类
     */
    private VideoCard videoCard = null;

    /**
     * 交互的同事类-声卡类
     */
    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver) {
            //把光驱数据读取了
            this.opeCDDriverReadData((CDDriver)colleague);
        } else if (colleague == cpu) {
            //表示CPU处理完了
            this.opeCPU(cpu);
        }
    }

    /**
     * 处理光驱读取数据以后与其他对象的交互
     * @param cd 光驱同事对象
     */
    private void opeCDDriverReadData(CDDriver cd) {
        //1.先获取光驱读取的数据
        String data = cd.getData();
        //2.把这些数据传递给cpu进行处理
        this.cpu.executeData(data);
    }

    private void opeCPU(CPU cpu) {
        //1.先获取cpu处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        //2.把这些数据传递给显卡和声卡显示出来
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }
}
