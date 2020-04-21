package com.rj.design.study.interpreter.eg2;


/**
 * 用于处理自定义xml取值表达式的接口
 * @author renjin
 * @date 2020/1/10
 */
public abstract class ReadXmlExpression {


    public abstract String[] interpret(Context c);
}
