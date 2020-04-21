package com.rj.design.study.adapter.eg3;

import com.rj.design.study.adapter.eg.LogModel;
import com.rj.design.study.adapter.eg.LogDbOperateApi;

import java.util.List;

/**
 * DB存储日志的实现，简单示意一下
 */
public class LogDbOperateImpl implements LogDbOperateApi {

    @Override
    public void createLog(LogModel logModel) {
        System.out.println("now in LogDbOperateImpl createLog, logModel=" + logModel);
    }

    @Override
    public void updateLog(LogModel logModel) {
        System.out.println("now in LogDbOperateImpl updateLog, logModel=" + logModel);
    }

    @Override
    public void removeLog(LogModel logModel) {
        System.out.println("now in LogDbOperateImpl removeLog, logModel=" + logModel);
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("now in LogDbOperateImpl getAllLog");
        return null;
    }
}
