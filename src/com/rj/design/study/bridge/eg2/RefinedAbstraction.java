package com.rj.design.study.bridge.eg2;

/**
 * 扩充有Abstraction定义的接口功能
 * @author renjin
 * @date 2020/1/14
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 实现一定的功能
     */
    public void otherOpeation() {
        //实现一定的功能，可能会视同具体实现部分的实现方法
        //但是本方法更大的可能是视同Abstraction中定义的方法
        //通过组合使用Abstraction中定义的方法来完成更多的功能
    }
}
