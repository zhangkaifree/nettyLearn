package com.zk.learn.algorithm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: nettyLearn
 * @description: 剑指offer，剪绳子题目
 * @author: zhangkai
 * @create: 2020-05-05 20:58
 */
public class MaxAfterCutting {
/*    给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
  每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
    例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。*/

    public static void main(String[] args) {
        System.out.println(getMaxAfterCutting(8));
        Map map = new ConcurrentHashMap();
        map.put("","");
    }


    public static int getMaxAfterCutting(int len){
        //解体思路:n长，就能剪n-1下。
        //

        if(len == 1){
            return 0;
        }
        if(len == 2){
            return 1;
        }
        if(len == 3){
            return 2;
        }
        return 3;
    }
}
