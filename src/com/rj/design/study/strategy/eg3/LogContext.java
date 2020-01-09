package com.rj.design.study.strategy.eg3;

/**
 * 日志记录的上下文
 * @author renjin
 * @date 2020/1/7
 */
public class LogContext {

    public void log(String msg) {
        LogStrategy strategy = new DbLog();

        try {
            strategy.log(msg);
        } catch (Exception e) {
            //出错了， 那就记录到文件中
            strategy = new FileLog();
            strategy.log(msg);
        }
    }
}
