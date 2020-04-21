package com.rj.design.study.flyweight.eg3;

/**
 * 描述授权数据的享元接口
 * @author renjin
 * @date 2020/1/10
 */
public interface Flyweight {

    /**
     * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
     * @param securityEntity
     * @param permit
     * @return
     */
    boolean match(String securityEntity, String permit);

    /**
     * 为Flyweight添加子Flyweight对象
     * @param f
     */
    void add(Flyweight f);
}
