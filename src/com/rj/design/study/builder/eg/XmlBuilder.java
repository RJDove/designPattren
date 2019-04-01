package com.rj.design.study.builder.eg;

import com.rj.design.study.builder.ExportDataModel;
import com.rj.design.study.builder.ExportFooterModel;
import com.rj.design.study.builder.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 实现导出数据到xml文件的生成器对象
 */
public class XmlBuilder implements Builder {

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
        buffer.append("<? xml version='1.0' encoding='gb2312'?>" + "\n");
        buffer.append("<Report>\n");
        buffer.append("  <Header>\n");
        buffer.append("    <DeptId>").append(exportHeaderModel.getDeptId()).append("</DeptId>\n");
        buffer.append("    <ExportDate>").append(exportHeaderModel.getExportDate()).append(" </ExportDate>\n");
        buffer.append("  </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        //2.接着再来拼接文件体的内容
        buffer.append("  <Body>\n");
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            buffer.append("    <Datas TableName=\"").append(tblName).append("\">\n");
            //再循环拼接具体的数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append("      <Data>\n");
                buffer.append("        <ProductId>").append(edm.getProductId()).append("</ProdectId>\n");
                buffer.append("        <Price>").append(edm.getPrice()).append("</Price>\n");
                buffer.append("        <Amount>").append(edm.getAmount()).append("</Amount>\n");
                buffer.append("      </Data>\n");
            }
            buffer.append("    </Datas>\n");
        }
        buffer.append("  </Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel exportFooterModel) {
        //3.再来拼接文件尾部内容
        buffer.append("  <Footer>\n");
        buffer.append("    <ExportUser>").append(exportFooterModel.getExportUser()).append("</ExportUser>\n");
        buffer.append("  </Footer>\n");
        buffer.append("</Report>");
    }
}
