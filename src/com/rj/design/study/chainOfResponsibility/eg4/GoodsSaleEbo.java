package com.rj.design.study.chainOfResponsibility.eg4;

/**
 * @author renjin
 * @date 2020/1/13
 */
public class GoodsSaleEbo {

    public boolean sale(String user, String customer, SaleModel saleModel) {
        /**
         * 1.权限检查
         * 2.通用数据检查
         * 3.数据逻辑检验
         * 4.真正的业务处理
         */
        SaleSecurityCheck saleSecurityCheck = new SaleSecurityCheck();
        SaleDataCheck saleDataCheck = new SaleDataCheck();
        SaleLogicCheck saleLogicCheck = new SaleLogicCheck();
        SaleMgr saleMgr = new SaleMgr();
        saleSecurityCheck.setSuccessor(saleDataCheck);
        saleDataCheck.setSuccessor(saleLogicCheck);
        saleLogicCheck.setSuccessor(saleMgr);

        //向链上的第一个对象发出处理请求
        return saleSecurityCheck.sale(user, customer, saleModel);
    }
}
