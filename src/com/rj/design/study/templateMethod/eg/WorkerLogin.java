package com.rj.design.study.templateMethod.eg;

import com.rj.design.study.templateMethod.model.LoginModel;

/**
 * 工作人员登录处理逻辑
 */
public class WorkerLogin extends LoginTemplate {

    /**
     * 根据登录编号来查找和和获取存储中的相应数据
     *
     * @param loginId
     * @return
     */
    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel loginModel = new LoginModel();
        loginModel.setUserId(loginId);
        loginModel.setPwd("workerPwd");
        return loginModel;
    }

    @Override
    public String encryptPwd(String pwd) {
        //覆盖父类的方法，提供真正的加密实现，使用MD5加密
        System.out.println("使用MD5进行密码加密");
        return pwd;
    }
}
