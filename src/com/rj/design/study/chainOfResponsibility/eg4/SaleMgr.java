package com.rj.design.study.chainOfResponsibility.eg4;

/**
 * 真正处理销售业务功能的职责对象
 * @author renjin
 * @date 2020/1/13
 */
public class SaleMgr extends SaleHandler {


    //进行真正的业务处理逻辑
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println(user + "保存了" + customer + "购买" + saleModel + " 的销售数据");
        return true;
    }
}
