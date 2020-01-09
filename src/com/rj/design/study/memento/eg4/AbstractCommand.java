package com.rj.design.study.memento.eg4;

import com.rj.design.study.memento.eg.Memento;

/**
 * 命令对象的公共对象，实现各个命令对象的公共方法
 * @author renjin
 * @date 2020/1/9
 */
public abstract class AbstractCommand implements Command {

    /**
     * 具体的功能实现，这里不管
     */
    public abstract void execute();

    /**
     * 持有真正的命令实现者对象
     */
    protected OperationApi operation;

    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }

    public Memento createMemento() {
        return this.operation.createMemento();
    }

    @Override
    public void redo(Memento m) {
        this.operation.setMemento(m);
    }

    @Override
    public void undo(Memento m) {
        this.operation.setMemento(m);
    }
}
