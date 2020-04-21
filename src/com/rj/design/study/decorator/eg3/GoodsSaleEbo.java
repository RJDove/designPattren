package com.rj.design.study.decorator.eg3;

/**
 * @author renjin
 * @date 2020/1/13
 */
public class GoodsSaleEbo implements GoodsSaleEbi {

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println(user + "保存了" + customer + "购买了" + saleModel + " 的销售数据");
        return true;
    }
}
