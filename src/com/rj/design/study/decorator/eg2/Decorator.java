package com.rj.design.study.decorator.eg2;

import java.util.Date;

/**
 * 装饰器的接口，需要和被装饰的对象实现同样的接口
 */
public abstract class Decorator extends Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //转调组件对象的方法
        return component.calcPrize(user, begin, end);
    }
}
