package com.rj.design.study.abstractFactory.eg;

import com.rj.design.study.abstractFactory.AbstractProductA;
import com.rj.design.study.abstractFactory.AbstractProductB;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();

    CPUApi createCPUApi();

    MainboardAPI createMainboardAPI();
}
