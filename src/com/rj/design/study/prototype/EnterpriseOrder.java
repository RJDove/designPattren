package com.rj.design.study.prototype;

/**
 * 企业订单对象
 */
public class EnterpriseOrder implements OrderApi {
    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    @Override
    public OrderApi cloneOrder() {
        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setEnterpriseName(this.enterpriseName);
        enterpriseOrder.setProductId(this.productId);
        enterpriseOrder.setOrderProductNum(this.orderProductNum);
        return enterpriseOrder;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
        return "本企业订单的订购人是=" + this.enterpriseName
                + ",订购产品是=" + this.productId + ",订购数量为="
                + this.orderProductNum;
    }
}
