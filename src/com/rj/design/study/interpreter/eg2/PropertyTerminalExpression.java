package com.rj.design.study.interpreter.eg2;

/**
 * 属性作为终结符对应的解释器
 * @author renjin
 * @date 2020/1/10
 */
public class PropertyTerminalExpression extends ReadXmlExpression {

    /**
     * 属性的名字
     */
    private String propName;

    public PropertyTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Context c) {
        String[] ss = new String[1];
        ss[0] = c.getPreEle().getAttribute(this.propName);
        return ss;
    }
}
