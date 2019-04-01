package com.rj.design.study.command.eg;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/1/13
 * @modifyBy
 */
public class GigaMainBoard implements MainBoardApi{

    /**
     * 主板具有开机的功能
     */
    @Override
    public void open() {
        System.out.println("技嘉主板现在正在开机，请稍后");
        System.out.println("接通电源。。。。");
        System.out.println("设备检查。。。。");
        System.out.println("装载系统。。。。");
        System.out.println("机器正常运转起来。。。。");
        System.out.println("机器已经正常打开，请操作");
    }

}
