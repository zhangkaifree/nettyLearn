package com.zk.learn.disign;

/**
 * @program: nettyLearn
 * @description:
 * @author: zhangkai
 * @create: 2020-07-01 22:33
 */
public class ProxyInterImpl implements ProxyInter {
    private BeiProxyInter beiProxyInter;

    public ProxyInterImpl(BeiProxyInter beiProxyInter) {
        this.beiProxyInter = beiProxyInter;
    }

    @Override
    public void doSomtime() {
        System.out.println("代理人干的");
        beiProxyInter.say();
    }
}
