package com.rj.design.study.decorator;

import java.util.Date;

/**
 * 计算奖金的对象
 */
public class Prize {

    public double calcPrize(String user, Date begin, Date end) {
        double prize = 0;
        //计算当月业务奖金，所有人都会计算
        prize = this.monthPrize(user, begin, end);
        //计算累计奖金
        prize += this.sumPrize(user, begin, end);
        //需要判断该人员是普通人员还是业务经理，团队奖金只有业务经理才有
        if (this.isManager(user)) {
            prize += this.groupPrize(user, begin, end);
        }
        return prize;
    }

    /**
     * 计算团队奖金
     *
     * @param user
     * @param begin
     * @param end
     * @return
     */
    private double groupPrize(String user, Date begin, Date end) {
        //假设都是一个团队的
        double group = 0.0;
        for (double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金" + prize);
        return prize;
    }

    private boolean isManager(String user) {
        return "王五".equals(user);
    }

    /**
     * 计算某人累计奖金
     *
     * @param user
     * @param begin
     * @param end
     * @return
     */
    private double sumPrize(String user, Date begin, Date end) {
        double prize = 100000 * 0.01;
        System.out.println(user + "累计奖金" + prize);
        return prize;
    }

    /**
     * 计算当月业务奖金
     *
     * @param user
     * @param begin
     * @param end
     * @return
     */
    private double monthPrize(String user, Date begin, Date end) {
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "月业务奖金: " + prize);
        return prize;
    }
}
