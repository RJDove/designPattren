package com.rj.design.study.observer;

/**
 * 具体报纸对象
 */
public class NewsPaper {

    /**
     * 报纸名字
     */
    private String newsPaperName;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNewsPaperName() {
        return newsPaperName;
    }

    public void setNewsPaperName(String newsPaperName) {
        this.newsPaperName = newsPaperName;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "newsPaperName='" + newsPaperName + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
