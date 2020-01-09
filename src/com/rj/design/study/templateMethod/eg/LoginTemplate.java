package com.rj.design.study.templateMethod.eg;

import com.rj.design.study.templateMethod.model.LoginModel;

/**
 * 登录控制的模板
 */
public abstract class LoginTemplate {

    public final boolean login(LoginModel loginModel) {
        //1.根据人员的编号去获取相应的数据
        LoginModel dbModel = this.findLoginUser(loginModel.getUserId());
        if (dbModel != null) {
            //2.对密码进行加密
            String encryptPwd = this.encryptPwd(loginModel.getPwd());
            loginModel.setPwd(encryptPwd);
            //3.判断是否匹配
            return this.match(loginModel, dbModel);
        }
        return false;
    }

    /**
     * 根据登录编号来查找和和获取存储中的相应数据
     * @param loginId
     * @return
     */
    public abstract LoginModel findLoginUser(String loginId);

    /**
     * 对数据进行加密
     * @param pwd
     * @return
     */
    public String encryptPwd(String pwd) {
        //这里对密码进行加密，省略了
        return pwd;
    }

    /**
     * 判断用户填写的登录数据和存储中对应的数据是否匹配得上
     * @param lm
     * @param dbLm
     * @return
     */
    public boolean match(LoginModel lm, LoginModel dbLm) {
        if (lm.getUserId().equals(dbLm.getUserId()) && lm.getPwd().equals(dbLm.getPwd())) {
            return true;
        }
        return false;
    }
}
