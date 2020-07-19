package com.zk.learn.reflection;

/**
 * @program: nettyLearn
 * @description: 测试反射
 * @author: zhangkai
 * @create: 2020-07-01 22:07
 */
public class TestRefletion {
    public static void main(String[] args) throws Exception {
        Gun aClass = (Gun)Class.forName("com.zk.learn.reflection.Gun").newInstance();


    }

}
class Gun{
    static{
        System.out.println("gun 干啥玩意了");
    }
}
