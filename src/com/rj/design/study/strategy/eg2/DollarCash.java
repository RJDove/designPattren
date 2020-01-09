package com.rj.design.study.strategy.eg2;

/**
 * 美元现金支付
 * @author renjin
 * @date 2020/1/7
 */
public class DollarCash implements PaymentStrategy{

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "美元现金支付" + ctx.getMoney() + "元");
    }
}
