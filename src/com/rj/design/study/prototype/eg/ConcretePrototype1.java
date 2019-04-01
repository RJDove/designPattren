package com.rj.design.study.prototype.eg;

/**
 * 克隆的具体实现对象
 */
public class ConcretePrototype1 implements Prototype {

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
