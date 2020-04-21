package com.rj.design.study.flyweight.eg2;

/**
 * 享元接口，通过这个享元接口可以接受并作用于外部状态
 * @author renjin
 * @date 2020/1/10
 */
public interface Flyweight {

    /**
     * 传入外部状态
     * @param extrinsicState
     */
    void operation(String extrinsicState);
}
