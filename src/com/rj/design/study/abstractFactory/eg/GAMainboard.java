package com.rj.design.study.abstractFactory.eg;

/**
 * 技嘉的主板
 */
public class GAMainboard implements MainboardAPI{
    /**
     * cpu 插槽的孔数
     */
    private int cpuHoles = 0;

    @Override
    public void installCPU() {
        System.out.println("now in GAMainboard,cpuHoles: " + cpuHoles);
    }

    public int getCpuHoles() {
        return cpuHoles;
    }

    public void setCpuHoles(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }
}
