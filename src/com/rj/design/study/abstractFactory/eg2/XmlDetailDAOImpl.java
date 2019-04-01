package com.rj.design.study.abstractFactory.eg2;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/3/29
 * @modifyBy
 */
public class XmlDetailDAOImpl implements OrderDetailDAO{

    /**
     * 保存订单子记录
     */
    @Override
    public void saveOrderDetail() {
        System.out.println("now in XmlDetailDAOImpl saveOrderDetail.");
    }
}
