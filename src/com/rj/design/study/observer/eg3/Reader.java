package com.rj.design.study.observer.eg3;

import com.rj.design.study.observer.eg2.NewsPaper;
import com.rj.design.study.observer.eg2.Subject;

import java.util.Observable;

/**
 * 真正的读者（采用拉的方式）
 *
 * @author renjin
 * @date 2020/1/21
 */
public class Reader implements java.util.Observer {

    /**
     * 读者的姓名
     */
    private String name;

    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，阅读它，内容是===" + ((NewsPaper) subject).getContent());
    }


    @Override
    public void update(Observable o, Object arg) {
        //这是采用推的方式
        //对于要获取推的数据，在目标实现里面调用的时候必须用推的方式，
        //就是
        System.out.println(name + "收到报纸了，阅读它，内容是===" + arg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
