package com.rj.design.study.adapter.rj02;

import com.rj.design.study.adapter.first.LogFileOperateApi;
import com.rj.design.study.adapter.first.LogFileOperateImpl;
import com.rj.design.study.adapter.first.LogModel;
import com.rj.design.study.adapter.second.LogDbOperateApi;

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
        LogFileOperateApi fileLogApi = new LogFileOperateImpl("");
        LogDbOperateApi dbOperateApi = new LogDbOperateImpl();

        LogFileOperateApi fileLogApi2 = new TwoDirectAdapter(fileLogApi, dbOperateApi);
        LogDbOperateApi dbOperateApi2 = new TwoDirectAdapter(fileLogApi, dbOperateApi);

        //先测试从文件操作适配到第二版
        //虽然调用的是第二版的接口，其实是文件操作在实现
        dbOperateApi2.createLog(logModel);
        List<LogModel> allLog = dbOperateApi2.getAllLog();
        System.out.println("allLog=" + allLog);

        //再测试从数据库存储适配成第一版的接口
        //也就是调用第一版的接口，其实是数据实现
        fileLogApi2.writeLogFile(list);
        fileLogApi2.readLogFile();
    }
}
