package com.rj.design.study.state.eg2.model;

/**
 * 请假单数据模型
 * @author renjin
 * @date 2020/1/8
 */
public class LeaveRequestModel {

    /**
     * 请假人
     */
    private String user;

    /**
     * 请假开始时间
     */
    private String beginDate;

    /**
     * 请假天数
     */
    private int leaveDays;

    /**
     * 审核结果
     */
    private String result;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
