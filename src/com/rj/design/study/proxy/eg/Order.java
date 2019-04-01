package com.rj.design.study.proxy.eg;

public class Order implements OrderApi {

    /**
     * 订单订购的产品名称
     */
    private String productName;

    /**
     * 订单订购的数量
     */
    private int orderNum;

    /**
     * 创建订单的人员
     */
    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    /**
     * 设置订单订购的产品名称
     *
     * @param productName
     * @param user
     */
    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    /**
     * 获取订单订购的数量
     *
     * @return
     */
    @Override
    public int getOrderNum() {
        return this.orderNum;
    }

    /**
     * 设置订单订购的数量
     *
     * @param orderNum
     * @param user
     */
    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    /**
     * 获取创建订单的人员
     *
     * @return
     */
    @Override
    public String getOrderUser() {
        return this.orderUser;
    }

    /**
     * 设置创建订单的人员
     *
     * @param orderUser
     * @param user
     */
    @Override
    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }
}
