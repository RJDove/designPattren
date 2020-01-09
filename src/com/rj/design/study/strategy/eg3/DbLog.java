package com.rj.design.study.strategy.eg3;

/**
 * 把日志记录到数据库
 * @author renjin
 * @date 2020/1/7
 */
public class DbLog implements LogStrategy {

    @Override
    public void log(String msg) {
        if (msg != null && msg.trim().length() > 5) {
            int a = 5/0;
        }
        System.out.println("现在把 '" + msg + "' 记录到数据库中");
    }
}
