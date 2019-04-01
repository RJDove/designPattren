package com.rj.design.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 */
public class Subject {

    /**
     * 保存观察者对象
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    protected void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
