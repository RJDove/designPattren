package com.rj.design.study.observer.eg1;


/**
 * 真正的读者（采用推的方式）
 *
 * @author renjin
 * @date 2020/1/21
 */
public class Reader implements Observer {

    /**
     * 读者的姓名
     */
    private String name;

    @Override
    public void update(String content) {
        System.out.println(name + "收到报纸了，阅读它，内容是===" + content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
