package com.rj.design.study.adapter.first;

import java.util.List;

/**
 * 日志文件操作接口
 */
public interface LogFileOperateApi {

    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     * @return
     */
    public List<LogModel> readLogFile();

    /**
     * 写日志文件，把日志列表写出到日志文件中
     * @param list
     */
    public void writeLogFile(List<LogModel> list);
}
