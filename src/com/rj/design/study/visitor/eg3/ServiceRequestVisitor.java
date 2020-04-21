package com.rj.design.study.visitor.eg3;

/**
 * 具体的访问者，实现客户提出服务请求的功能
 * @author renjin
 * @date 2020/1/15
 */
public class ServiceRequestVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        //企业客户提出的具体服务请求
        System.out.println(ec.getName() + "企业提出的具体服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        //个人客户提出的具体服务请求
        System.out.println(pc.getName() + "客户提出的具体服务请求");
    }
}
