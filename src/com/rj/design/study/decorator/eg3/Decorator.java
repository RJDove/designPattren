package com.rj.design.study.decorator.eg3;

/**
 * 装饰器的接口，需要和被装饰的对象实现同样的接口
 * @author renjin
 * @date 2020/1/13
 */
public abstract class Decorator implements GoodsSaleEbi {

    /**
     * 持有被装饰的组件对象
     */
    protected GoodsSaleEbi ebi;

    public Decorator(GoodsSaleEbi ebi) {
        this.ebi = ebi;
    }
}
