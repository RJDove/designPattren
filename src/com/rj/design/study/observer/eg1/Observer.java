package com.rj.design.study.observer.eg1;


/**
 * 观察者，比如报纸的读者
 */
public interface Observer {

    /**
     * 被通知的方法，直接把报纸的内容推动过来
     * @param content
     */
    void update(String content);

}
