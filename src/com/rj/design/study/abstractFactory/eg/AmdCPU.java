package com.rj.design.study.abstractFactory.eg;

/**
 * AMD cpu
 */
public class AmdCPU implements CPUApi{

    /**
     * 针脚数
     */
    private int pins = 0;

    @Override
    public void calculate() {
        System.out.println("now in AMD cpu,pins: " + pins);
    }

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }

    public AmdCPU(int pins) {
        this.pins = pins;
    }
}
