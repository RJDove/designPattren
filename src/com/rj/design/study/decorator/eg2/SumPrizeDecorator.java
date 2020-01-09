package com.rj.design.study.decorator.eg2;

import java.util.Date;

/**
 * 装饰器对象，计算累计奖金
 */
public class SumPrizeDecorator extends Decorator {

    public SumPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //1.先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //2.然后计算累计奖金
        double prize = 100000 * 0.01;
        System.out.println(user + "累计奖金奖金：" + prize);
        return prize + money;
    }
}
