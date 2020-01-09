package com.rj.design.study.decorator.eg2;

import java.util.Date;

public abstract class Component {

    /**
     * 计算奖金
     * @param user
     * @param begin
     * @param end
     * @return
     */
    public abstract double calcPrize(String user, Date begin, Date end);
}
