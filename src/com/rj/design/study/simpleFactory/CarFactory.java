package com.rj.design.study.simpleFactory;

public class CarFactory {

    public static CarApi makeCarInstance(String type) {
        if ("audi".equals(type)) {
            return new AudiCar();
        }
        if ("benz".equals(type)) {
            return new BenzCar();
        }
        return null;
    }
}
