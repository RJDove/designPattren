package com.rj.design.study.memento.eg4;

import com.rj.design.study.memento.eg.Memento;

/**
 * 操作运算的接口
 * @author renjin
 * @date 2020/1/9
 */
public interface OperationApi {

    /**
     * 获取计算完成后的结果
     * @return
     */
    int getResult();

    /**
     * 执行加法
     * @param num
     */
    void add(int num);

    /**
     * 执行减法
     * @param num
     */
    void substract(int num);

    /**
     * 创建保存原发器对象状态的备忘录对象
     * @return
     */
    Memento createMemento();

    /**
     * 重新设置原发器对象状态，让其回到备忘录对象记录的状态
     */
    void setMemento(Memento m);
}
