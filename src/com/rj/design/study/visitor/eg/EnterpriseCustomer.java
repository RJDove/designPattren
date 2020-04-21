package com.rj.design.study.visitor.eg;

/**
 * @author renjin
 * @date 2020/1/14
 */
public class EnterpriseCustomer extends Customer {

    private String linkman;

    private String linkTelephone;

    private String registerAddress;

    @Override
    public void serviceRequest() {
        //企业客户提出的具体服务请求
        System.out.println(this.getName() + "企业提出的具体服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        //根据以往购买的历史、潜在购买意向以及客户所在行业的发展趋势，客户的发展预期等的分析
        System.out.println("现在对企业客户" + this.getName() + "进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在对企业客户" + this.getName() + "进行产品价值分析");
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }
}
