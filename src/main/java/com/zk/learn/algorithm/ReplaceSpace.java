package com.zk.learn.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: nettyLearn
 * @description: 替换空格
 * @author: zhangkai
 * @create: 2020-04-09 22:40
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        String str = "are you ok";
        System.out.println(str.replace(" ","%20"));
        int len = str.split(" ").length;
        int newlen = len-1;
        char[] ca = Arrays.copyOf(str.toCharArray(), str.length() + newlen*3);
        int left = 0,rigth = ca.length;
        for(int i = rigth-1;i<ca.length;i--){
            char a = ca[i];
            if(left == newlen){
                break;
            }
            if(a == ' '){
                ca[rigth - 1] = '0';
                ca[rigth - 2] = '2';
                ca[rigth - 3] = '%';
                rigth -= 3;
                left++;
            }else{
                ca[rigth - 1] = a;
                rigth--;
            }
        }

        System.out.println(String.valueOf(ca));

    }
}
