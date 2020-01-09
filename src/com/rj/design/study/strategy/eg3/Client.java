package com.rj.design.study.strategy.eg3;

/**
 * 容灾恢复机制演示
 * @author renjin
 * @date 2020/1/7
 */
public class Client {

    public static void main(String[] args) {
        LogContext log = new LogContext();
        log.log("记录日志");
        log.log("再次记录日志");
    }
}
