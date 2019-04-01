package com.rj.design.study.adapter.rj02;

import com.rj.design.study.adapter.first.LogFileOperateApi;
import com.rj.design.study.adapter.first.LogModel;
import com.rj.design.study.adapter.second.LogDbOperateApi;

import java.util.List;

/**
 * 双向适配器对象
 */
public class TwoDirectAdapter implements LogFileOperateApi, LogDbOperateApi {

    /**
     * 持有需要被适配的文件存储日志的接口对象
     */
    private LogFileOperateApi fileLog;

    /**
     * 持有需要内适配的DB存储日志的接口对象
     */
    private LogDbOperateApi dbLog;

    public TwoDirectAdapter(LogFileOperateApi fileLog, LogDbOperateApi dbLog) {
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }

    /**********************以下是把文件操作的方式适配成为DB实现方式的接口**********************/
    @Override
    public void createLog(LogModel logModel) {
        //1.先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        //2.加入新的日志对象
        list.add(logModel);
        //3.重新写入文件
        fileLog.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        //1.先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        //2.修改相应的日志对象
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }
        //3.重新写入文件
        fileLog.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        //1.先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        //2.删除相应的日志对象
        list.remove(logModel);
        //3.重新写入文件
        fileLog.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }

    /**********************以下是把DB操作的方式适配成为文件实现方式的接口**********************/
    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     *
     * @return
     */
    @Override
    public List<LogModel> readLogFile() {
        return dbLog.getAllLog();
    }

    /**
     * 写日志文件，把日志列表写出到日志文件中
     *
     * @param list
     */
    @Override
    public void writeLogFile(List<LogModel> list) {
        for (LogModel logModel : list) {
            dbLog.createLog(logModel);
        }
    }
}
