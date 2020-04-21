package com.rj.design.study.abstractFactory.eg2;

/**
 * @version 1.0.0
 * @desc
 * @auth eg2
 * @date 2019/3/29
 * @modifyBy
 */
public class RdbDAOFactory extends DAOFactory {

    /**
     * 创建订单主记录对应的DAO对象
     *
     * @return
     */
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    /**
     * 创建订单子记录对象的DAO对象
     *
     * @return
     */
    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
