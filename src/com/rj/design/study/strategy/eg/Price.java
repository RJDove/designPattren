package com.rj.design.study.strategy.eg;

/**
 * 价格管理，主要完成计算向客户所报价的功能
 * @author renjin
 * @date 2020/1/7
 */
public class Price {

    /**
     * 持有一个具体的策略对象
     */
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 报价，计算对客户的报价
     * @param goodsPrice
     * @return
     */
    public double quote(double goodsPrice) {
        return this.strategy.calcPrice(goodsPrice);
    }
}
