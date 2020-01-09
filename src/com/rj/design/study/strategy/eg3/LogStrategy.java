package com.rj.design.study.strategy.eg3;

/**
 * 日志记录策略的接口
 * @author renjin
 * @date 2020/1/7
 */
public interface LogStrategy {

    /**
     * 记录日志
     * @param msg
     */
    void log(String msg);
}
