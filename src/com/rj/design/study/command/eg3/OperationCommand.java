package com.rj.design.study.command.eg3;

/**
 * 命令接口，声明执行的操作
 */
public interface OperationCommand {

    /**
     * 执行命令对应的操作
     */
    void execute();

    /**
     * 撤销命令操作
     */
    void undo();
}
