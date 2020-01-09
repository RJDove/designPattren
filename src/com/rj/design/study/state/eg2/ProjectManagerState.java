package com.rj.design.study.state.eg2;

import com.rj.design.study.state.eg2.model.LeaveRequestModel;

import java.util.Scanner;

/**
 * 处理项目经理的审核，处理后可能对应部门经理审核或者审核结束之中的一种
 *
 * @author renjin
 * @date 2020/1/8
 */
public class ProjectManagerState implements LeaveRequestState {

    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        System.out.println("项目经理审核中，请稍后....");
        //模拟用户处理界面，通过控制台来读取数据
        System.out.println(lrm.getUser() + "申请从" + lrm.getBeginDate() + "开始请假" + lrm.getLeaveDays()
                + "天，请项目经理审核（1为同意， 2为不同意）: ");
        //业务处理，把审核结果保存到数据库中

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            String result = "不同意";
            if (a == 1) {
                result = "同意";
            }
            lrm.setResult("项目经理审核结果：" + result);
            if (a == 1) {
                if (lrm.getLeaveDays() > 3) {
                    //请假天数大于3天，而且项目经理同意了
                    request.setState(new DepManagerState());
                } else {
                    //项目经理自己做主，处理后转向结束状态
                    request.setState(new AuditOverState());
                }
            } else {
                //项目经理不同意，处理后转向结束状态
                request.setState(new AuditOverState());
            }
            request.doWork();
        }

    }
}
