package com.rj.design.study.memento.eg4;

/**
 * @author renjin
 * @date 2020/1/9
 */
public class Client {

    public static void main(String[] args) {
        OperationApi operation = new Operation();

        AddCommand addCmd = new AddCommand(5);

        SubstractCommand substractCmd = new SubstractCommand(3);

        addCmd.setOperation(operation);

        substractCmd.setOperation(operation);

        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCmd);
        calculator.setSubstractCmd(substractCmd);

        calculator.addPressed();
        System.out.println("一次加法后运算后的结果为：" + operation.getResult());

        calculator.substractPressed();
        System.out.println("一次减法后运算后的结果为：" + operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销一次后的结果为：" + operation.getResult());
        calculator.undoPressed();
        System.out.println("再撤销一次后的结果为：" + operation.getResult());

        calculator.redoPressed();
        System.out.println("恢复操作一次后的结果为：" + operation.getResult());
        calculator.redoPressed();
        System.out.println("再恢复操作一次后的结果为：" + operation.getResult());
    }
}
