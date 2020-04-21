package com.rj.design.study.flyweight.eg3;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂，通常实现成为单例
 * @author renjin
 * @date 2020/1/10
 */
public class FlyweightFactory {

    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {

    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    /**
     * 缓存多个Flyweight对象
     */
    private Map<String, Flyweight> fsMap = new HashMap<>();

    /**
     * 获取key对应的享元对象
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        Flyweight f = fsMap.get(key);
        if (f == null) {
            f = new AuthorizationFlyweight(key);
            fsMap.put(key, f);
        }
        return f;
    }
}
