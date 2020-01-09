package com.rj.design.study.decorator;

public class Client {
    public static void main(String[] args) {
        Prize p = new Prize();
        double zhangSan = p.calcPrize("张三", null, null);
        System.out.println("=====张三的奖金为：" + zhangSan);
        double liSi = p.calcPrize("李四", null, null);
        System.out.println("=====李四的奖金为：" + liSi);
        double wangWu = p.calcPrize("王五", null, null);
        System.out.println("=====王五的奖金为：" + wangWu);
    }
}
