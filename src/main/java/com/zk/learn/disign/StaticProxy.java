package com.zk.learn.disign;

/**
 * @program: nettyLearn
 * @description: 静态代理
 * @author: zhangkai
 * @create: 2020-07-01 22:32
 */
public class StaticProxy {
    public static void main(String[] args) {
        ProxyInter proxyInter = new ProxyInterImpl(new BeiProxyInterImpl());
        proxyInter.doSomtime();
    }
}
