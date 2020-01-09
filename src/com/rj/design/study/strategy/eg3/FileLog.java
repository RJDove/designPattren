package com.rj.design.study.strategy.eg3;

/**
 * 把日志记录到文件
 * @author renjin
 * @date 2020/1/7
 */
public class FileLog implements LogStrategy {

    @Override
    public void log(String msg) {
        System.out.println("现在把 '" + msg + "' 记录到文件中");
    }
}
