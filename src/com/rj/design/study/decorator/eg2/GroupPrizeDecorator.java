package com.rj.design.study.decorator.eg2;

import com.rj.design.study.decorator.TempDB;

import java.util.Date;

/**
 * 装饰器对象，计算当月团队业务奖金
 */
public class GroupPrizeDecorator extends Decorator {

    public GroupPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //1.先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //2.然后计算团队奖金
        //假设都是一个团队的
        double group = 0.0;
        for (Double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金：" + prize);
        return prize + money;
    }
}
