package com.rj.design.study.command.eg3;

/**
 * 具体的减法命令实现对象
 */
public class SubstractCommandImpl implements OperationCommand{

    /**
     * 持有具体执行计算的对象
     */
    private OperationApi operation = null;

    /**
     * 操作的数据，也就是要加上的数据
     */
    private int opeNum;

    public SubstractCommandImpl(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }

    /**
     * 执行命令对应的操作
     */
    @Override
    public void execute() {
        //执行减法
        this.operation.substrace(opeNum);
    }

    /**
     * 撤销命令操作
     */
    @Override
    public void undo() {
        //执行加法
        this.operation.add(opeNum);
    }
}
