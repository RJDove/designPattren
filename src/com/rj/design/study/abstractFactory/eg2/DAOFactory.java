package com.rj.design.study.abstractFactory.eg2;

/**
 * @version 1.0.0
 * @desc 抽象工厂，创建订单主，子记录对应的DAO对象
 * @auth rj
 * @date 2019/3/29
 * @modifyBy
 */
public abstract class DAOFactory {

    /**
     * 创建订单主记录对应的DAO对象
     * @return
     */
    public abstract OrderMainDAO createOrderMainDAO();

    /**
     * 创建订单子记录对象的DAO对象
     * @return
     */
    public abstract OrderDetailDAO createOrderDetailDAO();
}
