package com.zk.learn.algorithm;

/**
 * @program: nettyLearn
 * @description: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author: zhangkai
 * @create: 2020-04-15 00:04
 */
public class NumberOf {
    //补码，计算机的中的标示都是以补码的形式
    //整数的补码和源码一样，负数的 整数取反加一同一个数字在不同的补码表示形式中是不同的。比如-15的补码，在8位二进制中是11110001，然而在16位二进制补码表示中，就是1111111111110001。以下都使用8位2进制来表示。
    //例：求-5的补码。
    //-5对应正数5（00000101）→所有位取反（11111010）→加1(11111011)
    //所以-5的补码是11111011。
    public static void main(String[] args) {

    }
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0)
        {
            ++ count;
            n = (n - 1) & n;  //把一个整数减去1，再和原整数相与，会把该整数最右边的1变为0。
        }
        return count;

    }
}
