package com.rj.design.study.abstractFactory;

import com.rj.design.study.abstractFactory.eg.AbstractFactory;
import com.rj.design.study.abstractFactory.eg.ComputerEngineer;
import com.rj.design.study.abstractFactory.eg.Schemal1;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        //生产A、B产品
        factory.createProductA();
        factory.createProductB();

        //组装电脑过程
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory factory1 = new Schemal1();
        computerEngineer.makeComputer(factory1);
    }
}
