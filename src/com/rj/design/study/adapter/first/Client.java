package com.rj.design.study.adapter.first;

import com.rj.design.study.adapter.first.LogFileOperateApi;
import com.rj.design.study.adapter.first.LogFileOperateImpl;
import com.rj.design.study.adapter.first.LogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/3/27
 * @modifyBy
 */
public class Client {

    public static void main(String[] args) {
        //准备日志内容，也就是测试的数据
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2019-03-27 19:20:00");
        logModel.setLogContent("这是一个测试");

        List<LogModel> list = new ArrayList<>();
        list.add(logModel);
        //创建操作日志文件的对象
        LogFileOperateApi api = new LogFileOperateImpl("");
        //保存日志文件
        api.writeLogFile(list);

        //读取日志文件的内容
        List<LogModel> readLog = api.readLogFile();
        System.out.println("readLog=" + readLog);
    }
}
