package com.rj.design.study.chainOfResponsibility.eg4;

/**
 * 进行数据逻辑检查的职责对象
 *
 * @author renjin
 * @date 2020/1/13
 */
public class SaleLogicCheck extends SaleHandler {

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行数据的逻辑检查，比如检查ID的唯一性，主外键的对应关系

        //如果通过了上面的检测，那就向下继续执行
        return this.successor.sale(user, customer, saleModel);
    }
}
