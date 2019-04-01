package com.rj.design.study.adapter.rj;


import com.rj.design.study.adapter.first.LogFileOperateApi;
import com.rj.design.study.adapter.first.LogModel;
import com.rj.design.study.adapter.second.LogDbOperateApi;

import java.util.List;

/**
 * 单向适配器
 */
public class Adapter implements LogDbOperateApi {

    /**
     * 持有需要被适配的接口对象
     */
    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel logModel) {
        //1.先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2.加入新的日志对象
        list.add(logModel);
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        //1.先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2.修改相应的日志对象
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        //1.先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2.删除相应的日志对象
        list.remove(logModel);
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
