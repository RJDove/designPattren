package com.rj.design.study.strategy.eg2;

/**
 * 支付工资的策略接口，公司有多种支付工资的算法
 * 比如，现金、银行卡、现金加股票、现金加期权、美元支付等
 * @author renjin
 * @date 2020/1/7
 */
public interface PaymentStrategy {

    /**
     * 公司给某人真正支付工资
     * @param ctx
     */
    void pay(PaymentContext ctx);
}
