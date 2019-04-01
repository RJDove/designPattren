package com.rj.design.study.proxy.eg;

public class OrderProxy implements OrderApi {

    /**
     * 持有被代理的具体的目标对象
     */
    private Order order;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param order 被代理的具体的目标对象
     */
    public OrderProxy(Order order) {
        this.order = order;
    }

    /**
     * 获取订单订购的产品名称
     *
     * @return
     */
    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    /**
     * 设置订单订购的产品名称
     *
     * @param productName
     * @param user
     */
    @Override
    public void setProductName(String productName, String user) {
        //控制访问权限 只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setProductName(productName, user);
        } else {
            System.out.println("对不起" + user + ",您无权修改订单中的产品名称。");
        }
    }

    /**
     * 获取订单订购的数量
     *
     * @return
     */
    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    /**
     * 设置订单订购的数量
     *
     * @param orderNum
     * @param user
     */
    @Override
    public void setOrderNum(int orderNum, String user) {
        //控制访问权限 只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderNum(orderNum, user);
        } else {
            System.out.println("对不起" + user + ",您无权修改订单中的产品名称。");
        }
    }

    /**
     * 获取创建订单的人员
     *
     * @return
     */
    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    /**
     * 设置创建订单的人员
     *
     * @param orderUser
     * @param user
     */
    @Override
    public void setOrderUser(String orderUser, String user) {
        //控制访问权限 只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
           order.setOrderUser(orderUser, user);
        } else {
            System.out.println("对不起" + user + ",您无权修改订单中的产品名称。");
        }
    }

    @Override
    public String toString() {
        return  "productName=" + this.getProductName() + ",orderName=" + this.getOrderNum()
                +",orderUser=" +this.getOrderUser();
    }
}
