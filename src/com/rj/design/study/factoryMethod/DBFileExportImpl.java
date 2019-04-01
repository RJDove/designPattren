package com.rj.design.study.factoryMethod;

public class DBFileExportImpl implements FileExportApi{

    /**
     * 数据库导出文件
     * @param data 待导出的文件
     * @return 是否成功
     */
    @Override
    public boolean export(String data) {
        System.out.println("使用[数据库方式]导出文件：" + data);
        return true;
    }
}
