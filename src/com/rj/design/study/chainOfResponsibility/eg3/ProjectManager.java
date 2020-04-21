package com.rj.design.study.chainOfResponsibility.eg3;

/**
 * 项目经理处理请求
 * @author renjin
 * @date 2020/1/13
 */
public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            if ("小李".equals(user)) {
                str = "项目经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                str = "项目经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
        } else {
            if (this.successor != null) {
                return successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }


    @Override
    public boolean handlePreFeeRequest(String user, double requestFee) {
        if (requestFee < 5000) {
            System.out.println("项目经理同意" + user + "预支差旅费用" + requestFee + "元的请求");
            return true;
        } else {
            if (this.successor != null) {
                return successor.handlePreFeeRequest(user, requestFee);
            }
        }

        return false;
    }
}
