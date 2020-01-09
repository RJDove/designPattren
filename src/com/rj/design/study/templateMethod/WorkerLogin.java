package com.rj.design.study.templateMethod;

import com.rj.design.study.templateMethod.model.LoginModel;
import com.rj.design.study.templateMethod.model.WorkerModel;

/**
 * 工作人员登录控制的处理逻辑
 */
public class WorkerLogin {

    /**
     * 判断登录数据是否正确，也就是判断是否能登录成功
     * @param loginModel
     * @return
     */
    public boolean login(LoginModel loginModel) {
        //1.根据工作人员编号去获取工作人员的数据
        WorkerModel worker = this.findWorkerByWorkerId(loginModel.getUserId());
        //2.判断从前台传递过来的用户名和加密后的密码数据，和数据库已有的数据是否匹配
        if (worker != null) {
            //3.对前台传过来的密码进行加密
            String encryptPwd = this.encryptPwd(loginModel.getPwd());
            return loginModel.getUserId().equals(worker.getWorkerId()) && encryptPwd.equals(worker.getPwd());
        }
        return false;
    }

    private String encryptPwd(String pwd) {
        //这里对密码进行加密，省略了
        return pwd;
    }

    private WorkerModel findWorkerByWorkerId(String workerId) {
        // 这里省略具体的逻辑，仅做示意，返回一个有默认数据的对象
        WorkerModel workerModel = new WorkerModel();
        workerModel.setWorkerId(workerId);
        workerModel.setName("worker1");
        workerModel.setPwd("worker1");
        workerModel.setUuid("worker001");
        return workerModel;
    }
}
