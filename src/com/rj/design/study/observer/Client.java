package com.rj.design.study.observer;

public class Client {
    public static void main(String[] args) {

        NewsPaper newsPaper = new NewsPaper();
        newsPaper.setContent("内容是.....");
        newsPaper.setNewsPaperName("新华日报");
        newsPaper.setTitle("报纸标题！！");

        Reader reader1 = new Reader("张三",newsPaper);
        Reader reader2 = new Reader("李四",newsPaper);
        Reader reader3 = new Reader("王五",newsPaper);
        Reader reader4 = new Reader("赵六",newsPaper);

        NewsPaperOffice newsPaperOffice = new NewsPaperOffice();
        newsPaperOffice.setNewsPaperOfficeName("新华社");

        //注册订阅者
        newsPaperOffice.attach(reader1);
        newsPaperOffice.attach(reader2);
        newsPaperOffice.attach(reader3);
        newsPaperOffice.attach(reader4);

        //更新报纸
        NewsPaper newsPaper1 = new NewsPaper();
        newsPaper1.setContent("内容是.....新的");
        newsPaper1.setNewsPaperName("新华日报");
        newsPaper1.setTitle("报纸标题！！新的");
        newsPaperOffice.setNewsPaper(newsPaper1);

    }
}
