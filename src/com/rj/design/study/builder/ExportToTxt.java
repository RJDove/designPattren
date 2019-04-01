package com.rj.design.study.builder;

import java.util.Collection;
import java.util.Map;

/**
 * 导出数据到文本文件的对象
 */
public class ExportToTxt {

    /**
     * 导出数据到文本文件
     * @param ehm 文件头的内容
     * @param mapData 文件内容
     * @param efm 文件尾的内容
     */
    public void export(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData
                        ,ExportFooterModel efm) {
        //用来记录最终输出的文件内容
        StringBuffer buffer = new StringBuffer();
        //1.先来拼接文件头的内容
        buffer.append(ehm.getDeptId() + "," + ehm.getExportDate() + "\n");
        //2.接着再来拼接文件体的内容
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            buffer.append(tblName + "\n");
            //再循环拼接具体的数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append(edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmount() + "\n");
            }
        }
        System.out.println("输出到文本文件的内容：\n" + buffer);
    }
}
