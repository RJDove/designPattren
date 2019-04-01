package com.rj.design.study.prototype;

import java.util.Date;

/**
 * 个人订单对象
 */
public class PersonalOrder implements OrderApi{

    /**
     * 订购人员姓名
     */
    private String customerName;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    private Date now;
    @Override
    public OrderApi cloneOrder() {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setCustomerName(this.customerName);
        personalOrder.setProductId(this.productId);
        personalOrder.setOrderProductNum(this.orderProductNum);
        personalOrder.setNow(this.now);
        return personalOrder;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }


    @Override
    public String toString() {
        return "本人订单的订购人是=" + this.customerName
                + ",订购产品是=" + this.productId + ",订购数量为="
                + this.orderProductNum + ",now: " + now;
    }
}
