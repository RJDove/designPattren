package com.rj.design.study.adapter.eg;

import java.util.List;

/**
 * 定义操作日志的应用接口，为了示例的简单，只是简单地定义了增删改查的方法
 * 第二版
 */
public interface LogDbOperateApi {

    void createLog(LogModel logModel);

    void updateLog(LogModel logModel);

    void removeLog(LogModel logModel);

    List<LogModel> getAllLog();

}
