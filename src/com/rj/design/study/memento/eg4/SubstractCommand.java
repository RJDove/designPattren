package com.rj.design.study.memento.eg4;

/**
 * 减法命令
 * @author renjin
 * @date 2020/1/9
 */
public class SubstractCommand extends AbstractCommand {

    private int opeNum;

    public SubstractCommand(int opeNum) {
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operation.substract(opeNum);
    }
}
