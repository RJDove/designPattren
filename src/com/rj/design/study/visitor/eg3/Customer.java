package com.rj.design.study.visitor.eg3;

/**
 * @author renjin
 * @date 2020/1/15
 */
public abstract class Customer {

    private String customerId;

    private String name;

    /**
     * 接受访问者的访问
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
