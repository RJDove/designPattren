package com.rj.design.study.command.eg;

import com.rj.design.study.command.Command;

/**
 * @version 1.0.0
 * @desc 机箱对象，本身有按钮，持有按钮对应的命令对象
 * @auth rj
 * @date 2019/1/13
 * @modifyBy
 */
public class Box {

    /**
     * 开机命令对象
     */
    private Command openCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    /**
     * 提供给客户使用，接收并响应用户请求，相当于被按下触发的方法
     */
    public void openButtonPressed() {
        //按下按钮，执行命令
        openCommand.execute();
    }

    /**
     * 重启机器命令
     */
    private Command resetCommand;

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void resetConmandPressed() {
        //按下重启机器命令
        resetCommand.execute();
    }
}
