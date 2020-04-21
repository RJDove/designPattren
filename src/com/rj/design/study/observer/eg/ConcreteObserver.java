package com.rj.design.study.observer.eg;

/**
 * 具体观察者对象
 */
public class ConcreteObserver implements Observer {

    /**
     * 观察者对象状态
     */
    private String observerState;

    @Override
    public void update(Subject subject) {
        /**
         * 具体的业务逻辑
         */

        //更新观察者状态与目标状态一致
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
