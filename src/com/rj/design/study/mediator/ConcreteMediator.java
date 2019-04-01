package com.rj.design.study.mediator;

/**
 * 具体的中介者实现
 */
public class ConcreteMediator implements Mediator {

    /**
     * 持有并维护同事A
     */
    private ConcreteColleagueA colleagueA;

    /**
     * 持有并维护同事B
     */
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague colleague) {

    }
}
