package com.rj.design.study.factoryMethod;

public abstract class AbstractExportOperator {

    protected abstract FileExportApi factoryMethod();

    public boolean export(String data) {
        return factoryMethod().export(data);
    }


}
