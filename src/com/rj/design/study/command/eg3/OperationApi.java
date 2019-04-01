package com.rj.design.study.command.eg3;

/**
 * 【补偿式或者反操作式的解决方案】
 * 需求:
 *    考虑一个计算器的功能，原有功能只能实现加减法运算，
 *    现在要让这个计算器支持可撤销的操作
 */

/**
 * 操作运算的接口
 */
public interface OperationApi {

    /**
     * 获取计算完成后的结果
     * @return
     */
    int getResult();

    /**
     * 设置计算开始的初始值
     */
    void setResult(int result);

    /**
     * 执行加法计算
     * @param num
     */
    void add(int num);

    /**
     * 执行减法
     * @param num
     */
    void substrace(int num);
}
