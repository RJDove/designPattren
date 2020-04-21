package com.rj.design.study.flyweight.eg2;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author renjin
 * @date 2020/1/10
 */
public class FlyweightFactory {

    /**
     * 缓存多个Flyweight对象，这里只是示意一下
     */
    private Map<String, Flyweight> fsMap = new HashMap<>();

    /**
     * 获取key对应的享元对象
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        //1.先从缓存中查找，是否存在key对应的Flyweight对象
        Flyweight f = fsMap.get(key);

        //2.如果存在，就返回相应的Flyweight对象
        if (f == null) {
            //3.1如果不存在，创建一个新的Flyweight对象
            f = new ConcreteFlyweight(key);

            //3.2把这个新的Flyweight对象加到缓存中
            fsMap.put(key, f);
        }
        return f;
    }
}
