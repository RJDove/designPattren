package com.rj.design.study.factoryMethod;

public interface FileExportApi {

    /**
     * 文件导出的方式 主要有文本导出、数据库文件导出
     * @param data 待导出的文件
     * @return 是否导出成功
     */
    boolean export(String data);
}
