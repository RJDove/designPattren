package com.rj.design.study.flyweight.eg2;

/**
 * 不需要共享的flyweight对象
 * 通常是将被共享的享元对象作为子节点组合出来的对象
 * @author renjin
 * @date 2020/1/10
 */
public class UnshareConcreteFlyweight implements Flyweight{

    /**
     * 描述对象的状态
     */
    private String allState;

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理
    }
}
