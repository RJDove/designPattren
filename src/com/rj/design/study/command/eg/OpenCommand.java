package com.rj.design.study.command.eg;

import com.rj.design.study.command.Command;

/**
 * @version 1.0.0
 * @desc 开机命令的实现，实现Command接口
 * @auth eg2
 * @date 2019/1/13
 * @modifyBy
 */
public class OpenCommand implements Command {

    /**
     * 持有真正实现命令的接收者--主板对象
     */
    private MainBoardApi mainBoardApi = null;

    public OpenCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    /**
     * 执行命令对应的操作
     */
    @Override
    public void execute() {
        this.mainBoardApi.open();
    }
}
