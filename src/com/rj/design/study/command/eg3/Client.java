package com.rj.design.study.command.eg3;

/**
 * @version 1.0.0
 * @descripton
 * @auth eg2
 * @date 2019/4/2
 */
public class Client {

    public static void main(String[] args) {
        OperationApi operation = new OperationImpl();
        AddCommandImpl addCommand = new AddCommandImpl(operation, 5);
        SubstractCommandImpl substractCommand = new SubstractCommandImpl(operation, 3);

        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCommand);
        calculator.setSubstractCmd(substractCommand);

        calculator.addPressed();
        System.out.println("一次加法运算后的结果为： " + operation.getResult());

        calculator.subStractCmdPressed();
        System.out.println("一次减法运算后的结果为： " + operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销一次后的结果为: " + operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销二次后的结果为: " + operation.getResult());
    }
}
