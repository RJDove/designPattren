package com.rj.design.study.decorator.eg;

/**
 * 装饰器的具体实现对象，向组件对象添加职责
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 需要添加的职责
     */
    private void addedBehavior() {

    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
