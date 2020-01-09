package com.rj.design.study.strategy.eg2;

/**
 * 支付工资的上下文，每个人的工资不同，支付方式也不同
 * @author renjin
 * @date 2020/1/7
 */
public class PaymentContext {

    /**
     * 应被支付工资的人员
     */
    private String userName;

    /**
     * 应被支付的工资金额
     */
    private double money;

    /**
     * 支付工资的方式
     */
    private PaymentStrategy strategy;

    public PaymentContext(String userName, double money, PaymentStrategy strategy) {
        this.userName = userName;
        this.money = money;
        this.strategy = strategy;
    }


    public String getUserName() {
        return userName;
    }

    public double getMoney() {
        return money;
    }

    /**
     * 立即支付工资
     */
    public void payNow() {
        //使用客户希望的支付策略来支付工资
        this.strategy.pay(this);
    }
}
