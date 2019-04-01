package com.rj.design.study.command.eg3;

import java.util.LinkedList;

/**
 * 计算器类，计算器有加法按钮，减法按钮
 */
public class Calculator { //计算器类相当于Invoker

    private OperationCommand addCmd = null;

    private OperationCommand substractCmd = null;

    public void setAddCmd(OperationCommand addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubstractCmd(OperationCommand substractCmd) {
        this.substractCmd = substractCmd;
    }

    public void addPressed() {
        addCmd.execute();
        undoCmds.addLast(addCmd);
    }

    public void subStractCmdPressed() {
        substractCmd.execute();
        undoCmds.addLast(substractCmd);
    }

    /**
     * 命令的操作的历史记录，在撤销的时候用
     */
    private LinkedList<OperationCommand> undoCmds = new LinkedList<>();

    public void undoPressed() {
        if (undoCmds.size() == 0) {
            System.out.println("很抱歉，没有可撤销的命令");
        } else {
            OperationCommand command = undoCmds.removeLast();
            command.undo();
        }
    }
}
