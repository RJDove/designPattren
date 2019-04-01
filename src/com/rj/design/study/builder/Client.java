package com.rj.design.study.builder;

import com.rj.design.study.builder.eg.Director;
import com.rj.design.study.builder.eg.TxtBuilder;
import com.rj.design.study.builder.eg.XmlBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        //准备测试数据
        ExportHeaderModel exportHeaderModel = new ExportHeaderModel();
        exportHeaderModel.setDeptId("一分公司");
        exportHeaderModel.setExportDate("2018-12-16");

        Map<String, Collection<ExportDataModel>> dataMap = new HashMap<>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();

        ExportDataModel exportDataModel = new ExportDataModel();
        exportDataModel.setProductId("产品001号");
        exportDataModel.setPrice(99);
        exportDataModel.setAmount(100);
        ExportDataModel exportDataModel1 = new ExportDataModel();
        exportDataModel1.setProductId("产品002号");
        exportDataModel1.setPrice(69);
        exportDataModel1.setAmount(96);

        col.add(exportDataModel);
        col.add(exportDataModel1);
        dataMap.put("销售记录表", col);

        ExportFooterModel exportFooterModel = new ExportFooterModel();
        exportFooterModel.setExportUser("张三");

        //测试文本导出
        ExportToTxt exportToTxt = new ExportToTxt();
        exportToTxt.export(exportHeaderModel, dataMap, exportFooterModel);

        //测试xml导出
        ExportToXml exportToXml = new ExportToXml();
        exportToXml.export(exportHeaderModel, dataMap, exportFooterModel);

        /********************演示使用builder设计模式*************************/
        //1.使用文本导出
        System.out.println("/********************演示使用builder设计模式*************************/");
        TxtBuilder txtBuilder = new TxtBuilder();
        Director txtDirector = new Director(txtBuilder);
        txtDirector.constructProduct(exportHeaderModel, dataMap, exportFooterModel);
        System.out.println(txtBuilder.getResultProduct());

        //2.使用xml导出
        XmlBuilder xmlBuilder = new XmlBuilder();
        Director xmlDirector = new Director(xmlBuilder);
        xmlDirector.constructProduct(exportHeaderModel, dataMap, exportFooterModel);
        System.out.println(xmlBuilder.getResultProduct());
    }
}
