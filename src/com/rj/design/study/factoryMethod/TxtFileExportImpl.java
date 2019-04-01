package com.rj.design.study.factoryMethod;

public class TxtFileExportImpl implements FileExportApi {
    /**
     *  文本导出
     * @param data 待导出的文件
     * @return 是否成功
     */
    @Override
    public boolean export(String data) {
        System.out.println("使用[文本方式]导出文件：" + data);
        return true;
    }
}
