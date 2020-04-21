package com.rj.design.study.adapter.eg2;

import com.rj.design.study.adapter.eg.LogFileOperateApi;
import com.rj.design.study.adapter.eg.LogFileOperateImpl;
import com.rj.design.study.adapter.eg.LogModel;
import com.rj.design.study.adapter.eg.LogDbOperateApi;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @desc
 * @auth eg2
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
        LogFileOperateApi logFileApi = new LogFileOperateImpl("");

        //创建新版操作日志的接口对象
        LogDbOperateApi api = new Adapter(logFileApi);

        //保存日志文件
        api.createLog(logModel);
        //读取日志文件的内容
        List<LogModel> allLog = api.getAllLog();
        System.out.println("allLog=" + allLog);
    }
}
