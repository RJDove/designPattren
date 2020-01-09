package com.rj.design.study.state.eg2;

import com.rj.design.study.state.eg2.model.LeaveRequestModel;

/**
 * 请假测试
 * @author renjin
 * @date 2020/1/8
 */
public class Client {

    public static void main(String[] args) {
        //创建业务对象，并设置业务数据
        LeaveRequestModel lrm = new LeaveRequestModel();
        lrm.setUser("小李");
        lrm.setBeginDate("2020-01-08");
        lrm.setLeaveDays(5);

        //创建上下文对象
        LeaveRequestContext request = new LeaveRequestContext();
        request.setBusinessVO(lrm);

        request.setState(new ProjectManagerState());
        request.doWork();
    }
}
