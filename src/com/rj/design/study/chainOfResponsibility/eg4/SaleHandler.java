package com.rj.design.study.chainOfResponsibility.eg4;

/**
 * 定义职责对象的接口
 * @author renjin
 * @date 2020/1/13
 */
public abstract class SaleHandler {

    protected SaleHandler successor;

    public void setSuccessor(SaleHandler successor) {
        this.successor = successor;
    }

    public abstract boolean sale(String user, String customer, SaleModel saleModel);
}
