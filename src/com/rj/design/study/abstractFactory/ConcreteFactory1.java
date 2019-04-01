package com.rj.design.study.abstractFactory;

import com.rj.design.study.abstractFactory.eg.AbstractFactory;
import com.rj.design.study.abstractFactory.eg.CPUApi;
import com.rj.design.study.abstractFactory.eg.MainboardAPI;

/**
 * 具体的工厂实现对象，实现创建具体产品对象的操作
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

    @Override
    public CPUApi createCPUApi() {
        return null;
    }

    @Override
    public MainboardAPI createMainboardAPI() {
        return null;
    }
}
