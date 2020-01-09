package com.rj.design.study.templateMethod.eg;

import com.rj.design.study.templateMethod.model.LoginModel;

/**
 * 普通用户登录处理逻辑
 */
public class NormalLogin extends LoginTemplate{

    /**
     * 根据登录编号来查找和和获取存储中的相应数据
     *
     * @param loginId
     * @return
     */
    @Override
    public LoginModel findLoginUser(String loginId) {
        // 这里省略具体的逻辑，仅做示意，返回一个有默认数据的对象
        LoginModel loginModel = new LoginModel();
        loginModel.setPwd("testPwd");
        loginModel.setUserId(loginId);
        return loginModel;
    }
}
