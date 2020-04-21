package com.rj.design.study.interpreter.eg;

/**
 * 抽象表达式
 * @author renjin
 * @date 2020/1/10
 */
public abstract class AbstractExpression {

    /**
     * 解释的操作
     * @param ctx
     */
    public abstract void interpret(Context ctx);
}
