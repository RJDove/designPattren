package com.rj.design.study.command;

/**
 * @version 1.0.0
 * @desc 具体的命令实现对象
 * @auth eg2
 * @date 2019/1/13
 * @modifyBy
 */
public class ConcreteCommand implements Command {

    /**
     * 持有相应的接收者对象
     */
    private Receiver receiver = null;

    /**
     * 命令对象可以有自己的状态
     */
    private String state;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令对应的操作
     */
    @Override
    public void execute() {
        //通常会转调接收者对象的响应方法，让接收者来真正执行功能
        receiver.action();
    }
}
