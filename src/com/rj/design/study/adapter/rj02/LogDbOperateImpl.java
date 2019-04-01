package com.rj.design.study.adapter.rj02;

import com.rj.design.study.adapter.first.LogModel;
import com.rj.design.study.adapter.second.LogDbOperateApi;

import java.util.List;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/3/27
 * @modifyBy
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
