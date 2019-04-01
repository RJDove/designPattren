package com.rj.design.study.command.eg2;

import com.rj.design.study.command.Command;
import com.rj.design.study.command.eg.MainBoardApi;

/**
 * @version 1.0.0
 * @descripton 新增重启机器命令
 * @auth rj
 * @date 2019/4/1
 */
public class ResetCommand implements Command {

    /**
     * 持有真正实现命令的接收者--主板对象
     */
    private MainBoardApi mainBoardApi = null;

    public ResetCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    /**
     * 执行命令对应的操作
     */
    @Override
    public void execute() {
        this.mainBoardApi.reset();
    }
}
