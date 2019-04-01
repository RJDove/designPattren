package com.rj.design.study.abstractFactory.eg2;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/3/29
 * @modifyBy
 */
public class Client {

    public static void main(String[] args) {
        //创建DAO的抽象工厂
        DAOFactory daoFactory = new RdbDAOFactory();
        //通过抽象工厂来获取需要的DAO接口
        OrderMainDAO mainDAO = daoFactory.createOrderMainDAO();
        OrderDetailDAO detailDAO = daoFactory.createOrderDetailDAO();
        //调用DAO来完成数据存储的功能
        mainDAO.saveOrderMain();
        detailDAO.saveOrderDetail();
    }
}
