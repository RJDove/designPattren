package com.rj.design.study.chainOfResponsibility.eg4;

/**
 * 进行数据通用检查的职责对象
 * @author renjin
 * @date 2020/1/13
 */
public class SaleDataCheck extends SaleHandler{

    //进行数据通用检查
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        if (user == null || user.trim().length() == 0) {
            System.out.println("申请人不能为空");
            return false;
        }
        if (customer == null || customer.trim().length() == 0) {
            System.out.println("客户不能为空");
            return false;
        }
        return this.successor.sale(user, customer, saleModel);
    }
}
