package com.rj.design.study.visitor.eg;

/**
 * @author renjin
 * @date 2020/1/14
 */
public class PersonalCustomer extends Customer {

    private String telephone;

    private int age;

    @Override
    public void serviceRequest() {
        System.out.println(this.getName() + "客户提出的具体服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在对个人客户" + this.getName() + "进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在对个人客户" + this.getName() + "进行产品价值分析");
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
