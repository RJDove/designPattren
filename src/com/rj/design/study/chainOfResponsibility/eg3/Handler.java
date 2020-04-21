package com.rj.design.study.chainOfResponsibility.eg3;

/**
 * 定义职责对象的接口
 * @author renjin
 * @date 2020/1/13
 */
public abstract class Handler {

    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * @param user
     * @param fee
     * @return
     */
    public abstract String handleFeeRequest(String user, double fee);

    /**
     * 处理预支差旅费用的申请
     * @param user
     * @param requestFee
     * @return
     */
    public abstract boolean handlePreFeeRequest(String user, double requestFee);
}
