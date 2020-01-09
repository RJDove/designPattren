package com.rj.design.study.state.eg2;

import com.rj.design.study.state.eg2.model.LeaveRequestModel;

/**
 * 处理审核结束的类
 * @author renjin
 * @date 2020/1/8
 */
public class AuditOverState implements LeaveRequestState {

    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        System.out.println(lrm.getUser() + ", 你的请假申请已经结束，结果是： " + lrm.getResult());
        //业务处理，在数据中记录整个流程结束
    }
}