package com.rj.design.study.memento.eg3;

import com.rj.design.study.memento.eg2.FlowAMockMemento;

/**
 * 模拟运行流程A，只是一个示意，指代某个具体流程
 * 结合原型模式
 * @author renjin
 * @date 2020/1/9
 */
public class FlowAMockPrototype implements Cloneable{

    /**
     * 流程名称，不需要外部存储的状态数据
     */
    private String flowName;

    /**
     * 示意，指代某个中检结果，需要外部存储的数据状态
     */
    private int tempResult;

    /**
     * 示意，指代某个中检结果，需要外部存储的数据状态
     */
    private String tempState;

    public int getTempResult() {
        return tempResult;
    }

    public String getTempState() {
        return tempState;
    }

    /**
     * 示意，运行流程的第一个阶段
     */
    public void runPhaseOne() {
        //在这个阶段，可能产生了中间结果，示意一下
        tempResult = 3;
        tempState = "PhaseOne";
    }

    /**
     * 按照方案一来运行流程后半部分
     */
    public void schema1() {
        //示意，需要使用第一阶段产生的数据
        this.tempState += ",Schema1";
        System.out.println(this.tempState + " : now run " + tempResult);
        this.tempResult += 11;
    }


    /**
     * 按照方案二来运行流程后半部分
     */
    public void schema2() {
        //示意，需要使用第一阶段产生的数据
        this.tempState += ",Schema2";
        System.out.println(this.tempState + " : now run " + tempResult);
        this.tempResult += 22;
    }

    /**
     * 创建保存原发器对象状态的备忘录对象
     * @return
     */
    public FlowAMockMemento createMemento() {
        try {
            return new MementoImplPrototype((FlowAMockPrototype) this.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
     * @param memento
     */
    public void setMemento(FlowAMockMemento memento) {
        MementoImplPrototype mementoImpl = (MementoImplPrototype) memento;
        this.tempResult = mementoImpl.getFlowAMock().getTempResult();
        this.tempState = mementoImpl.getFlowAMock().getTempState();
    }


    /**
     * 真正的备忘录对象，实现备忘录窄接口
     * 实现成私有的内部类，不让外部访问
     */
    private static class MementoImplPrototype implements FlowAMockMemento {
        private FlowAMockPrototype flowAMock;

        public MementoImplPrototype(FlowAMockPrototype flowAMock) {
            this.flowAMock = flowAMock;
        }

        public FlowAMockPrototype getFlowAMock() {
            return flowAMock;
        }
    }

}
