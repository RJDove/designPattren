package com.rj.design.study.factoryMethod;

public class Client {

    public static void main(String[] args) {
        //使用文本导出方式导出文件
        AbstractExportOperator txtOperator = new TxtFileExportOperator();
        txtOperator.export("helloWorld");
        //使用数据库方式导出文件
        AbstractExportOperator dbOperator = new DBFileExportOperator();
        dbOperator.export("helloWorld");
    }
}
