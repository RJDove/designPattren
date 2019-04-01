package com.rj.design.study.abstractFactory.eg2;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/3/29
 * @modifyBy
 */
public class RdbMainDAOImpl implements OrderMainDAO {

    /**
     * 保存订单主记录
     */
    @Override
    public void saveOrderMain() {
        System.out.println("now in RdbMainDAOImpl saveOrderMain.");
    }
}
