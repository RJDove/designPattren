package com.rj.design.study.simpleFactory;

public class AudiCar implements CarApi {

    @Override
    public void makeCar() {
        System.out.println("生产奥迪car....");
    }
}
