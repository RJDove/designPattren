package com.rj.design.study.decorator.eg3;

/**
 * 实现权限控制
 * @author renjin
 * @date 2020/1/13
 */
public class CheckDecorator extends Decorator {

    public CheckDecorator(GoodsSaleEbi ebi) {
        super(ebi);
    }

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        if (!"张三".equals(user)) {
            System.out.println("对不起" + user + "，你没有保存销售单的权限");
            return false;
        } else {
            return this.ebi.sale(user, customer, saleModel);
        }
    }
}
