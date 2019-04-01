package com.rj.design.study.command.eg3;

/**
 * @version 1.0.0
 * @descripton
 * @auth rj
 * @date 2019/4/1
 */
public class OperationImpl implements OperationApi {

    private int result;

    /**
     * 获取计算完成后的结果
     *
     * @return
     */
    @Override
    public int getResult() {
        return result;
    }

    /**
     * 设置计算开始的初始值
     */
    @Override
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * 执行加法计算
     *
     * @param num
     */
    @Override
    public void add(int num) {
        //实现加法功能
        result += num;
    }

    /**
     * 执行减法
     *
     * @param num
     */
    @Override
    public void substrace(int num) {
        //实现减法功能
        result -= num;
    }

}
