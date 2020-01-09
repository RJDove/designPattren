package com.rj.design.study.strategy.eg2;

/**
 * @author renjin
 * @date 2020/1/7
 */
public class Client {

    public static void main(String[] args) {
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentContext ctx1 = new PaymentContext("小李", 5000, strategyRMB);
        ctx1.payNow();

        PaymentStrategy strategyDollar = new DollarCash();
        PaymentContext ctx2 = new PaymentContext("Petter", 8000, strategyDollar);
        ctx2.payNow();
    }
}
