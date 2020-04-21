package com.rj.design.study.visitor.eg3;

/**
 * 访问者接口
 * @author renjin
 * @date 2020/1/15
 */
public interface Visitor {

    /**
     * 访问企业客户，相当于给企业客户添加访问者的功能
     * @param ec
     */
    void visitEnterpriseCustomer(EnterpriseCustomer ec);

    /**
     * 访问个人客户，相当于给个人客户添加访问者的功能
     * @param pc
     */
    void visitPersonalCustomer(PersonalCustomer pc);
}
