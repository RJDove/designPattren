package com.rj.design.study.command;

/**
 * @version 1.0.0
 * @desc 调用者
 * @auth eg2
 * @date 2019/1/13
 * @modifyBy
 */
public class Invoker {

    /**
     * 设置调用者持有的命令对象
     */
    private Command command = null;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 示意方法，要求命令执行请求
     */
    public void runCommand() {
        command.execute();
    }

}
