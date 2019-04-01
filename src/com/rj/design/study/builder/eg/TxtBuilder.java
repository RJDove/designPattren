package com.rj.design.study.builder.eg;

import com.rj.design.study.builder.ExportDataModel;
import com.rj.design.study.builder.ExportFooterModel;
import com.rj.design.study.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 实现导出数据到文本文件的生成器对象
 */
public class TxtBuilder implements Builder {

    /**
     * 用来记录构建的文件的内容，相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    public String getResultProduct() {
        return buffer.toString();
    }

    @Override
    public void builderPart() {

    }

    @Override
    public void buildeHeader(ExportHeaderModel exportHeaderModel) {
        //1.先来拼接文件头的内容
        buffer.append(exportHeaderModel.getDeptId() + "," + exportHeaderModel.getExportDate() + "\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        //2.接着再来拼接文件体的内容
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            buffer.append(tblName + "\n");
            //再循环拼接具体的数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append(edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmount() + "\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel exportFooterModel) {

    }
}
