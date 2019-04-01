package com.rj.design.study.abstractFactory.eg;

/**
 * intel cpu
 */
public class IntelCPU implements CPUApi{

    /**
     * 针脚数
     */
    private int pins = 0;

    @Override
    public void calculate() {
        System.out.println("now in intel cpu,pins: " + pins);
    }

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }

    public IntelCPU(int pins) {
        this.pins = pins;
    }
}
