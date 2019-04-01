package com.rj.design.study.abstractFactory.eg;

import com.rj.design.study.abstractFactory.AbstractProductA;
import com.rj.design.study.abstractFactory.AbstractProductB;

/**
 * 装机策略1
 */
public class Schemal1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return null;
    }

    @Override
    public AbstractProductB createProductB() {
        return null;
    }

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardAPI createMainboardAPI() {
        return new MSIMainboard(1156);
    }
}
