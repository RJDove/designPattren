package com.rj.design.study.observer.eg2;


/**
 * 观察者，比如报纸的读者
 */
public interface Observer {

    /**
     * 被通知的方法
     * @param subject
     */
    void update(Subject subject);

}
