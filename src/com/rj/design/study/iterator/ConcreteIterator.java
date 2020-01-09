package com.rj.design.study.iterator;

/**
 * 具体的迭代器实现对象，示意的是聚合对象为数组的迭代器
 * 不同的聚合对象相应的迭代器实现是不一样的
 */
public class ConcreteIterator implements Iterator {

    /**
     * 持有被迭代的具体的聚合对象
     */
    private ConcreteAggregate aggregate;

    /**
     * 内部索引，记录当前迭代到的索引位置
     * -1表示刚开始的时候，迭代器指向聚合第一个对象之前
     */
    private int index = -1;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * 移动到聚合对象的第一个位置
     */
    @Override
    public void first() {
        index = 0;
    }

    /**
     * 移动到聚合对象的下一个位置
     */
    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index = index + 1;
        }
    }

    /**
     * 判断是否已经移动到聚合对象的最后一个位置
     *
     * @return true表示已经移动到聚合对象的最后一个位置
     * false表示还没有移动到聚合对象的最后一个位置
     */
    @Override
    public boolean isDone() {
        if (index == this.aggregate.size()) {
            return true;
        }
        return false;
    }

    /**
     * 获取迭代当前元素
     *
     * @return 迭代的当前元素
     */
    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
