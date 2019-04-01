package com.rj.design.study.abstractFactory.eg;

/**
 * 装机工程师类
 */
public class ComputerEngineer {

    /**
     * 装机需要的cpu
     */
    private CPUApi cpuApi;

    /**
     * 装机需要的mainboard
     */

    private MainboardAPI mainboardApi;

    /**
     * 装机过程
     * @param schemal
     */
    public void makeComputer(AbstractFactory schemal) {
        this.prepareHardwares(schemal);
    }

    /**
     * 组装配件
     * @param schemal
     */
    private void prepareHardwares(AbstractFactory schemal) {
        //使用抽象类获取对应的对象
        this.cpuApi = schemal.createCPUApi();
        this.mainboardApi = schemal.createMainboardAPI();

        //测试配件是否好用
        cpuApi.calculate();
        mainboardApi.installCPU();
    }
}
