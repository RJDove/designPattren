package com.rj.design.study.strategy;

/**
 * 价格管理，主要完成计算向客户所报价格的功能
 * @author renjin
 * @date 2020/1/7
 */
public class Price {

    /**
     * 报价，计算对客户的报价
     * @param goodsPrice
     * @param customerType
     * @return
     */
    public double quote(double goodsPrice, String customerType) {
        if ("普通客户".equals(customerType)) {
            System.out.println("对于新客户或者普通客户， 没有折扣");
            return goodsPrice;
        } else if ("老客户".equals(customerType)) {
            System.out.println("对于老客户，统一折扣5%");
            return goodsPrice * (1 - 0.05);
        } else if ("大客户".equals(customerType)) {
            System.out.println("对于大客户，统一折扣10%");
            return goodsPrice * (1- 0.1);
        }
        //其余人都是报原价
        return goodsPrice;
    }

    private double calcPriceForNormal(double goodsPrice) {
        System.out.println("对于新客户或者普通客户， 没有折扣");
        return goodsPrice;
    }

    private double calcPriceForOld(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice * (1 - 0.05);
    }

    private double calcPriceForLarge(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice * (1- 0.1);
    }


}
