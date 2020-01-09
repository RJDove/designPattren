package com.rj.design.study.singleton;

/**
 * 饿汉式单例模式
 */
public class Singleton {
    //类加载时初始化
    private static Singleton uniqueInstance = new Singleton();

    //私有化构造器
    private Singleton() {
    }

    /**
     * 提供一个全局的访问点
     */
    public static Singleton getInstance() {
        return uniqueInstance;
    }
}

/**
 * 懒汉式单例模式
 */
class SingletonForHungry {

    //此处使用static修饰和饿汉式稍微有点不同 此处使用static是为了静态方法调用
    private static SingletonForHungry uniqueInstance = null;

    //私有化构造器
    private SingletonForHungry() {
    }

    /**
     * 提供一个全局的访问点
     * 注意此时并不是线程安全的，可以使用加锁双重检查机制提高线程安全性
     */
    public static SingletonForHungry getInstance() {
        if (uniqueInstance == null) {
            return new SingletonForHungry();
        }
        return uniqueInstance;
    }
}

class SingletonForHungrySafe {

    private volatile static SingletonForHungrySafe uniqueInstance = null;

    private SingletonForHungrySafe() {
    }

    public SingletonForHungrySafe getInstance() {
        if (uniqueInstance == null) {
            synchronized (this) {
                if (uniqueInstance == null) {
                    return new SingletonForHungrySafe();
                }
            }
        }
        return uniqueInstance;
    }
}

class SingletonForHungryBest {
    private SingletonForHungryBest() {
    }

    private static class SingletonHolder {
        private static SingletonForHungryBest uniqueInstance = new SingletonForHungryBest();
    }

    public SingletonForHungryBest getInstance() {
        return SingletonHolder.uniqueInstance;
    }
}

enum SignletonEnum {
    INSTANCE;
}