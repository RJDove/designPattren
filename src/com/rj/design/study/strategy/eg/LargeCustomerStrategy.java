package com.rj.design.study.strategy.eg;

/**
 * 具体算法实现，为大客户应报的价格
 * @author renjin
 * @date 2020/1/7
 */
public class LargeCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice * (1- 0.1);
    }
}
