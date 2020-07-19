package com.zk.learn.guava;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels;

import java.util.UUID;

/**
 * @program: nettyLearn
 * @description: guava测试类
 * @author: zhangkai
 * @create: 2020-03-21 23:03
 */
public class TestMain {
    private static final int size = 1000000;
    public static void main(String[] args) {
        BloomFilter boBloomFilter = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8),size);
        String s = "";
        s.contains("");
        for (int i = 0;i < size;i++){
            String value = UUID.randomUUID().toString();
            boBloomFilter.put(value);
        }
    }
}
