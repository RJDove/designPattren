package com.rj.design.study.builder;

/**
 * 描述输出到文件头的具体对象
 */
public class ExportHeaderModel {

    /**
     * 分公司或者部门Id
     */
    private String deptId;

    /**
     * 导出数据的日期
     */
    private String exportDate;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
