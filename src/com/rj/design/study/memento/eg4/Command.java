package com.rj.design.study.memento.eg4;

import com.rj.design.study.memento.eg.Memento;

/**
 * 定义一个命令的接口
 * @author renjin
 * @date 2020/1/9
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令，恢复到备忘录对象记录的状态
     */
    void undo(Memento m);

    /**
     * 重做命令，恢复到备忘录对象记录的状态
     */
    void redo(Memento m);

    /**
     * 创建保存原发器对象状态的备忘录对象
     */
    Memento createMemento();
}
