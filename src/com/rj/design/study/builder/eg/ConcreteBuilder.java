package com.rj.design.study.builder.eg;

import com.rj.design.study.builder.ExportDataModel;
import com.rj.design.study.builder.ExportFooterModel;
import com.rj.design.study.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 具体的生成器实现对象
 */
public class ConcreteBuilder implements Builder {

    /**
     * 生成器最终构建的产品对象
     */
    private Product resultProduct;

    public Product getResultProduct() {
        return resultProduct;
    }

    public void setResultProduct(Product resultProduct) {
        this.resultProduct = resultProduct;
    }

    @Override
    public void builderPart() {
        //构建某个部件的功能处理
    }

    @Override
    public void buildeHeader(ExportHeaderModel exportHeaderModel) {

    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {

    }

    @Override
    public void buildFooter(ExportFooterModel exportFooterModel) {

    }
}
