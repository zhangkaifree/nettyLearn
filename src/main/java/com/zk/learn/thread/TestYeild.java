package com.zk.learn.thread;

/**
 * @program: nettyLearn
 * @description:
 * @author: zhangkai
 * @create: 2020-07-06 22:31
 */
public class TestYeild {
    public static void main(String[] args) {
      /*  Thread runnable = new Mythread();
        runnable.start();

        Thread Mythread1 = new Mythread1();
        Mythread1.start();*/
      int n = 32;
        System.out.println(n - (n >>> 2));

    }
}
class Mythread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadA--" + i);
            Thread.yield();
        }
    }
}class Mythread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadB--" + i);
            Thread.yield();
        }
    }
}