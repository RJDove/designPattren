package com.rj.design.study.builder.eg;

import com.rj.design.study.builder.ExportDataModel;
import com.rj.design.study.builder.ExportFooterModel;
import com.rj.design.study.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 生成器接口，定义创建一个产品对象所需的各个部件的操作
 */
public interface Builder {

    /**
     * 示意方法，构建某个部件
     */
    public void builderPart();

    /**
     * 构建输出文件的Header部分
     * @param exportHeaderModel 文件头的内容
     */
    public void buildeHeader(ExportHeaderModel exportHeaderModel);

    /**
     * 构建输出文件的Body部分
     * @param mapData 文件内容
     */
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * 构建输出文件的Footer部分
     * @param exportFooterModel 文件尾的内容
     */
    public void buildFooter(ExportFooterModel exportFooterModel);
}
