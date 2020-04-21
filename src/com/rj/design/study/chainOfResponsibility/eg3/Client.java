package com.rj.design.study.chainOfResponsibility.eg3;

/**
 * @author renjin
 * @date 2020/1/13
 */
public class Client {

    public static void main(String[] args) {
        //先要组装责任链
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试
        String ret1 = h3.handleFeeRequest("小李", 300);
        System.out.println("the ret=" + ret1);
        String ret2 = h3.handleFeeRequest("小张", 300);
        System.out.println("the ret=" + ret2);

        String ret3 = h3.handleFeeRequest("小李", 600);
        System.out.println("the ret=" + ret3);
        String ret4 = h3.handleFeeRequest("小张", 600);
        System.out.println("the ret=" + ret4);

        String ret5 = h3.handleFeeRequest("小李", 1200);
        System.out.println("the ret=" + ret5);
        String ret6 = h3.handleFeeRequest("小张", 1200);
        System.out.println("the ret=" + ret6);
    }
}
