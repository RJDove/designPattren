package com.rj.design.study.state.eg2;

import com.rj.design.study.state.eg2.model.LeaveRequestModel;

import java.util.Scanner;

/**
 * 处理部门经理的审核，处理后对应审核结束状态
 *
 * @author renjin
 * @date 2020/1/8
 */
public class DepManagerState implements LeaveRequestState {

    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        System.out.println("部门经理处理中，请稍后....");
        System.out.println(lrm.getUser() + "申请从" + lrm.getBeginDate() + "开始请假" + lrm.getLeaveDays()
                + "天，请部门经理审核（1为同意， 2为不同意）: ");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            String result = "不同意";
            if (a == 1) {
                result = "同意";
            }
            lrm.setResult("部门经理审核结果：" + result);
            //部门经理审核以后，直接转向审核结束状态
            request.setState(new AuditOverState());
            request.doWork();
        }


    }
}
