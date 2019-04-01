package com.rj.design.study.observer;

/**
 * 具体目标对象
 */
public class ConcreteSubject extends Subject {

    /**
     * 目标对象状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
