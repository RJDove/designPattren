package com.rj.design.study.simpleFactory;

public class BenzCar implements CarApi {
    @Override
    public void makeCar() {
        System.out.println("生产benz....");
    }
}
