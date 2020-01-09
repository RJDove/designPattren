package com.rj.design.study.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author renjin
 * @date 2019/11/25
 */
public class Proxy implements InvocationHandler {

    private Object target;

    public Proxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(target, args);
        System.out.println("after");
        return result;
    }

    public <T> T getProxy() {
        return (T) java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
