package com.rj.design.study.memento.eg4;

import com.rj.design.study.memento.eg.Memento;

/**
 * 运算类，真正实现加减算法
 *
 * @author renjin
 * @date 2020/1/9
 */
public class Operation implements OperationApi {

    /**
     * 记录运算的结果
     */
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void add(int num) {
        result += num;
    }

    @Override
    public void substract(int num) {
        result -= num;
    }

    @Override
    public Memento createMemento() {
        return new MementoImpl(result);
    }

    @Override
    public void setMemento(Memento m) {
        this.result = ((MementoImpl) m).getResult();
    }

    /**
     * 备忘录对象
     */
    private static class MementoImpl implements Memento {
        private int result;

        public MementoImpl(int result) {
            this.result = result;
        }

        public int getResult() {
            return result;
        }
    }
}
