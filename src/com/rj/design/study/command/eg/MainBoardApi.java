package com.rj.design.study.command.eg;

/**
 * @version 1.0.0
 * @desc 主板的接口
 * @auth eg2
 * @date 2019/1/13
 * @modifyBy
 */
public interface MainBoardApi {

    /**
     *  主板具有开机的功能
     */
    void open();

    /**
     * 增加重启功能
     */
    void reset();
}
