package com.rj.design.study.factoryMethod;

public class DBFileExportOperator extends AbstractExportOperator {

    @Override
    protected FileExportApi factoryMethod() {
        return new DBFileExportImpl();
    }
}
