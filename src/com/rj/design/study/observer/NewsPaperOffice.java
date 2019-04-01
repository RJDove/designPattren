package com.rj.design.study.observer;

/**
 * 报社
 */
public class NewsPaperOffice extends Subject{

    /**
     * 报社名
     */
    private String newsPaperOfficeName;

    private NewsPaper newsPaper;

    public NewsPaper getNewsPaper() {
        return newsPaper;
    }

    public void setNewsPaper(NewsPaper newsPaper) {
        this.newsPaper = newsPaper;
        //报纸有了新的更新，通知所有的订阅者
        notifyAllObservers();
    }

    public String getNewsPaperOfficeName() {
        return newsPaperOfficeName;
    }

    public void setNewsPaperOfficeName(String newsPaperOfficeName) {
        this.newsPaperOfficeName = newsPaperOfficeName;
    }
}
