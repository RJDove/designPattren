package com.rj.design.study.visitor.eg;

/**
 * @author renjin
 * @date 2020/1/14
 */
public abstract class Customer {

    private String name;

    private String customerId;

    public abstract void serviceRequest();

    /**
     * 客户对公司产品的偏好分析
     */
    public abstract void predilectionAnalyze();

    /**
     * 客户价值分析
     */
    public abstract void worthAnalyze();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
