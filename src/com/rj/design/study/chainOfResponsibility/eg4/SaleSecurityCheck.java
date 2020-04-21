package com.rj.design.study.chainOfResponsibility.eg4;

/**
 * 进行权限检查的职责对象
 * @author renjin
 * @date 2020/1/13
 */
public class SaleSecurityCheck extends SaleHandler {


    //进行权限检查，就小李能通过
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        if ("小李".equals(user)) {
            return this.successor.sale(user, customer, saleModel);
        } else {
            System.out.println("对不起" + user + ", 你没有保存销售信息的权限");
            return false;
        }
    }
}
