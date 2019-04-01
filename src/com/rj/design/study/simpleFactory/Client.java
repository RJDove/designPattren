package com.rj.design.study.simpleFactory;

public class Client {

    public static void main(String[] args) {
        CarApi benzCar = CarFactory.makeCarInstance("benz");
        benzCar.makeCar();
        CarApi audiCar = CarFactory.makeCarInstance("audi");
        audiCar.makeCar();
    }
}
