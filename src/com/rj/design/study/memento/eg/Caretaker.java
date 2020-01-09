package com.rj.design.study.memento.eg;

/**
 * 负责保存备忘录的对象
 * @author renjin
 * @date 2020/1/9
 */
public class Caretaker {

    /**
     * 记录被保存的备忘录对象
     */
    private Memento memento;

    /**
     * 保存备忘录对象
     * @param memento
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    /**
     * 获取被保存的备忘录对象
     * @return
     */
    public Memento retriveMemento() {
        return this.memento;
    }
}
