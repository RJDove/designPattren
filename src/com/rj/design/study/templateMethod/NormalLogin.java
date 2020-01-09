package com.rj.design.study.templateMethod;

import com.rj.design.study.templateMethod.model.LoginModel;
import com.rj.design.study.templateMethod.model.UserModel;

/**
 * 普通用户登录控制的逻辑处理
 */
public class NormalLogin {

    /**
     * 判断登录数据是否正确，也就是判断是否能登录成功
     * @param lm
     * @return
     */
    public boolean login(LoginModel lm) {
        //1.从数据库获取登录人员的信息，就是根据用户编号去获取人员的数据
        UserModel um = this.findUserByUserId(lm.getUserId());
        //2.判断从前台传递过来的数据和数据库中已有的数据是否匹配
        if (um != null) {
            return um.getUserId().equals(lm.getUserId()) && um.getPwd().equals(lm.getPwd());
        }
        return false;
    }

    /**
     * 根据用户编号获取用户的详细信息
     * @param userId
     * @return
     */
    private UserModel findUserByUserId(String userId) {
        // 这里省略具体的逻辑，仅做示意，返回一个有默认数据的对象
        UserModel userModel = new UserModel();
        userModel.setUserId(userId);
        userModel.setName("test");
        userModel.setPwd("test");
        userModel.setUuid("User001");
        return userModel;
    }
}
