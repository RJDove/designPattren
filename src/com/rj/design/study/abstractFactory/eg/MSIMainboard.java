package com.rj.design.study.abstractFactory.eg;

/**
 * 微星的主板
 */
public class MSIMainboard implements MainboardAPI{
    /**
     * cpu 插槽的孔数
     */
    private int cpuHoles = 0;

    @Override
    public void installCPU() {
        System.out.println("now in MSIMainBoard,cpuHoles: " + cpuHoles);
    }

    public int getCpuHoles() {
        return cpuHoles;
    }

    public void setCpuHoles(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }
}
