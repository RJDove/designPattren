package com.rj.design.study.decorator.eg3;

/**
 * 商品销售管理的业务接口
 * @author renjin
 * @date 2020/1/13
 */
public interface GoodsSaleEbi {

    /**
     * 保存销售信息
     * @param user
     * @param customer
     * @param saleModel
     * @return
     */
    boolean sale(String user, String customer, SaleModel saleModel);
}
