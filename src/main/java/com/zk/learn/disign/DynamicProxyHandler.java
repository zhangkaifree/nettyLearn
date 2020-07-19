package com.zk.learn.disign;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: nettyLearn
 * @description:
 * @author: zhangkai
 * @create: 2020-07-01 22:39
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        method.invoke(object,args);
        System.out.println("after");
        return null;
    }

    public static void main(String[] args) {
//        BeiProxyInterImpl beiProxyInter = new BeiProxyInterImpl();
        TestHello beiProxyInter = new TestHelloImpl();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(beiProxyInter);
        TestHello BeiProxyInter = (TestHello)Proxy.newProxyInstance(beiProxyInter.getClass().getClassLoader(), beiProxyInter.getClass().getInterfaces(), dynamicProxyHandler);
        BeiProxyInter.hello();

    }
}
