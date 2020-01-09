package com.rj.design.study.state.eg2;

/**
 * 公共状态接口
 * @author renjin
 * @date 2020/1/8
 */
public interface State {

    /**
     * 执行状态对应的功能处理
     * @param ctx
     */
    void doWork(StateMachine ctx);
}
