package com.rj.design.study.decorator.eg3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 实现日志记录
 * @author renjin
 * @date 2020/1/13
 */
public class LogDecorator extends Decorator {

    public LogDecorator(GoodsSaleEbi ebi) {
        super(ebi);
    }

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //执行业务功能
        boolean f = this.ebi.sale(user, customer, saleModel);

        //执行业务功能后记录日志
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("日志记录：" + user + "于" + sdf.format(new Date()) +
        "时保存了一条销售记录，客户是" + customer + "，购买记录是" + saleModel);
        return f;
    }
}
