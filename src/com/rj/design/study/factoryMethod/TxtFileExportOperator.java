package com.rj.design.study.factoryMethod;

public class TxtFileExportOperator extends AbstractExportOperator {

    @Override
    protected FileExportApi factoryMethod() {
        return new TxtFileExportImpl();
    }
}
