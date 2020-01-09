package com.rj.design.study.strategy.eg2;

/**
 * 人民币现金支付
 * @author renjin
 * @date 2020/1/7
 */
public class RMBCash implements PaymentStrategy{

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "人民币现金支付" + ctx.getMoney() + "元");
    }
}
