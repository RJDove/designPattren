package com.rj.design.study.builder.eg;

import com.rj.design.study.builder.ExportDataModel;
import com.rj.design.study.builder.ExportFooterModel;
import com.rj.design.study.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 指导者，使用生成器的接口来构建产品的对象
 */
public class Director {

    /**
     * 持有需要当前使用的生成器的对象
     */
    private Builder builder;

    /**
     * 构造方法传入生成器
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 示意方法，指导生成器构建最终的产品对象
     */
    public void construct() {
        //通过使用生成器接口来构建最终的产品对象
        builder.builderPart();
    }

    public void constructProduct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {

        //1.先构建Header
        builder.buildeHeader(ehm);

        //2.再构建Body
        builder.buildBody(mapData);

        //3.最后构建Footer
        builder.buildFooter(efm);
    }
}
