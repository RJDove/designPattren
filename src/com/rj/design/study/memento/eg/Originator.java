package com.rj.design.study.memento.eg;

/**
 * 原发器对象
 *
 * @author renjin
 * @date 2020/1/8
 */
public class Originator {

    /**
     * 表示原发器的状态
     */
    private String state;

    /**
     * 创建保存原发器对象的的状态的备忘录对象
     * @return
     */
    public Memento createMemnto() {
        return new MementoImpl(state);
    }

    /**
     * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
     * @param memento
     */
    public void setMemento(Memento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.state = mementoImpl.getState();
    }

    /**
     * 真正的备忘录对象，实现备忘录窄接口
     * 实现成私有的内部类，不让外部访问
     */
    private static class MementoImpl implements Memento {
        /**
         * 表示需要保存的状态
         */
        private String state;

        /**
         * 保存备忘录对象
         * @param state
         */
        public MementoImpl(String state) {
            this.state = state;
        }

        /**
         * 获取被保存的备忘录对象
         * @return
         */
        public String getState() {
            return state;
        }
    }
}
