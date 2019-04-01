package com.rj.design.study.abstractFactory.eg;

import com.rj.design.study.abstractFactory.AbstractProductA;
import com.rj.design.study.abstractFactory.AbstractProductB;

/**
 * 装机策略2
 */
public class Schemal2 implements AbstractFactory {

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
        return new AmdCPU(939);
    }

    @Override
    public MainboardAPI createMainboardAPI() {
        return new GAMainboard(939);
    }
}
