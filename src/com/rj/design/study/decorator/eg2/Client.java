package com.rj.design.study.decorator.eg2;

/**
 * 使用装饰模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        //先创建计算基本奖金的类，这也是被装饰的对象
        Component component = new ConcreteComponent();

        //普通业务人员奖金的计算
        Decorator d1 = new MonthPrizeDecorator(component);
        Decorator d2 = new SumPrizeDecorator(d1);

        double zhangsan = d2.calcPrize("张三", null, null);
        System.out.println("===张三的奖金：" + zhangsan);
        double lisi = d2.calcPrize("李四", null, null);
        System.out.println("===李四的奖金：" + lisi);

        //如果是业务经理，还需要计算团队奖金
        Decorator d3 = new GroupPrizeDecorator(d2);
        double wangwu = d3.calcPrize("王五", null, null);
        System.out.println("===王五的奖金：" + wangwu);

    }
}
