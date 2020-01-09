package com.rj.design.study.strategy.eg;

/**
 * @author renjin
 * @date 2020/1/7
 */
public class Client {

    public static void main(String[] args) {
        //1.选择并创建需要使用的策略对象
        Strategy strategy = new LargeCustomerStrategy();

        //2.创建上下文
        Price ctx = new Price(strategy);

        //3.计算报价
        double quote = ctx.quote(100);

        System.out.println("向客户报价：" + quote);
    }
}
