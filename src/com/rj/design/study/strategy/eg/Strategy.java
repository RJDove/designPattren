package com.rj.design.study.strategy.eg;

/**
 * 策略，定义计算报价算法的接口
 * @author renjin
 * @date 2020/1/7
 */
public interface Strategy {

    /**
     * 计算对应的报价
     * @param goodsPrice
     * @return
     */
    double calcPrice(double goodsPrice);
}
