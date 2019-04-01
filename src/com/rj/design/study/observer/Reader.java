package com.rj.design.study.observer;

public class Reader implements Observer{

    /**
     * 读者名字
     */
    private String readerName;

    /**
     * 订阅的报纸
     */
    private NewsPaper newsPaper;

    @Override
    public void update(Subject subject) {
       newsPaper = ((NewsPaperOffice)subject).getNewsPaper();
        System.out.println(readerName + "的报纸更新了，更新之后的内容为：" + newsPaper);
    }

    public Reader(String readerName) {
        this.readerName = readerName;
    }

    public Reader(String readerName, NewsPaper newsPaper) {
        this.readerName = readerName;
        this.newsPaper = newsPaper;
    }
}
