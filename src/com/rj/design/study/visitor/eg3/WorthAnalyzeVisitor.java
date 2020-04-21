package com.rj.design.study.visitor.eg3;

/**
 * @author renjin
 * @date 2020/1/15
 */
public class WorthAnalyzeVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println("现在对企业客户" + ec.getName() + "进行产品价值分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("现在对个人客户" + pc.getName() + "进行产品价值分析");
    }
}
