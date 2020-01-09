package com.rj.design.study.state.eg2;

/**
 * 公共状态处理机，相当于状态模式的Context
 * 包含所有流程使用状态模式时的公共功能
 * @author renjin
 * @date 2020/1/8
 */
public class StateMachine {

    /**
     * 持有一个状态对象
     */
    private State state;

    /**
     * 包含流程处理需要的业务数据对象
     */
    private Object businessVO;

    /**
     * 执行工作，客户端处理流程的接口方法
     * 在客户完成自己的业务工作后调用
     */
    public void doWork() {
        this.state.doWork(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Object getBusinessVO() {
        return businessVO;
    }

    public void setBusinessVO(Object businessVO) {
        this.businessVO = businessVO;
    }
}
