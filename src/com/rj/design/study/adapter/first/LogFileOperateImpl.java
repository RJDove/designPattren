package com.rj.design.study.adapter.first;

import java.io.*;
import java.util.List;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/3/27
 * @modifyBy
 */
public class LogFileOperateImpl implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog.log";

    public LogFileOperateImpl(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     *
     * @return
     */
    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try {
            File f = new File(logFilePathName);
            if (f.exists()) {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List<LogModel>) oin.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oin != null) {
                try {
                    oin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    /**
     * 写日志文件，把日志列表写出到日志文件中
     *
     * @param list
     */
    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
