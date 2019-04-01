package com.rj.design.study.proxy.eg;

/**
 * 订单对象的接口定义
 */
public interface OrderApi {

    /**
     * 获取订单订购的产品名称
     * @return
     */
    public String getProductName();

    /**
     * 设置订单订购的产品名称
     * @param productName
     * @param user
     */
    public void setProductName(String productName, String user);

    /**
     * 获取订单订购的数量
     * @return
     */
    public int getOrderNum();

    /**
     * 设置订单订购的数量
     * @param orderNum
     * @param user
     */
    public void setOrderNum(int orderNum, String user);

    /**
     * 获取创建订单的人员
     * @return
     */
    public String getOrderUser();

    /**
     * 设置创建订单的人员
     * @param orderUser
     * @param user
     */
    public void setOrderUser(String orderUser, String user);
}
