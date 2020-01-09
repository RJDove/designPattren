package com.rj.design.study.memento.eg4;

/**
 * 加法命令
 * @author renjin
 * @date 2020/1/9
 */
public class AddCommand extends AbstractCommand {

    private int opeNum;

    public AddCommand(int opeNum) {
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operation.add(opeNum);
    }

}
