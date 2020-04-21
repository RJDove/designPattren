package com.rj.design.study.flyweight.eg3;

import java.util.ArrayList;
import java.util.List;

/**
 * 不需要共享的共享对象的实现，也是组合模式中的组合对象
 * @author renjin
 * @date 2020/1/10
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    /**
     * 记录每个组合对象所包含的子组件
     */
    private List<Flyweight> list = new ArrayList<>();

    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight f : list) {
            if (f.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Flyweight f) {
        list.add(f);
    }
}
