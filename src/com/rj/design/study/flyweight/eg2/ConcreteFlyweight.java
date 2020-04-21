package com.rj.design.study.flyweight.eg2;

/**
 * 享元对象
 * @author renjin
 * @date 2020/1/10
 */
public class ConcreteFlyweight  implements Flyweight{

    /**
     * 描述内部状态
     */
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理，可能会用到享元内部、外部的状态
    }
}
