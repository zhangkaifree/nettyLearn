package com.zk.learn.disign;

/**
 * @program: nettyLearn
 * @description:
 * @author: zhangkai
 * @create: 2020-07-01 22:34
 */
public class BeiProxyInterImpl implements BeiProxyInter {
    @Override
    public void say() {
        System.out.println("被代理人，找对象");
    }
}
