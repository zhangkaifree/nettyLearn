package com.zk.learn.algorithm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;

/**
 * @program: nettyLearn
 * @description: 二位数组查找
 * @author: zhangkai
 * @create: 2020-03-15 23:10
 */
public class ArraySearch {
    private static final Logger LOG = LogManager.getLogger();

    /*在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     解题思路：因为有序所以想到的二分法，它是个二维数组
     */
    public static void main(String[] args) {
        //解题思路
        //1.
        int[][] source = {{1,2,3,4,5},
                {2,4,5,4,5},
                {6,7,9,10,11}};
        find3(source,11);
    }


    /**
     * @param source
     * @param target
     * @return boolean
     * @description :从左下角开始搜索
     * @author zhangkai
     * @date 2020/4/7 10:48 下午
     */
    private static boolean find1(final int[][] source,  final int target){
        int higth = source.length;
        int weight = source[0].length;
        int row = higth - 1;
        int col = 0;
        while (row < higth && col < weight) {
            if (source[col][row] == target) {
                LOG.info("找到了，结束流程:{}{}", col, row);
                break;
            } else if (source[col][row] > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    } /**
     * @param source
     * @param target
     * @return boolean
     * @description :从右上角开始搜索
     * @author zhangkai
     * @date 2020/4/7 10:48 下午
     */
    private static boolean find2(final int[][] source,  final int target){
        int higth = source.length;
        int weight = source[0].length;
        int row = weight - 1;
        int col = 0;
        while (row >= 0 && col < higth) {
            if (source[col][row] == target) {
                LOG.info("找到了，结束流程:{}{}", col, row);
                break;
            } else if (source[col][row] > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }

    /**
     * @param source
     * @param target
     * @return boolean
     * @description 遍历一列，每一行中的数用二分法寻找
     * @author zhangkai
     * @date 2020/4/7 11:08 下午
     */
    private static boolean find3(final int[][] source,  final int target){
        int cols = source.length;
        for(int i= 0 ; i < cols;i++){
            int[] col = source[i];
            int maxIndex = col.length - 1;
            int minIndex = 0;
            while(minIndex <= maxIndex){
                int j = (maxIndex + minIndex)/2;
                int avg = col[j];
                if(avg > target){
                    maxIndex = j - 1;
                }else if(avg < target){
                    minIndex = j + 1;
                }else{
                    LOG.info("{}{}",i, j);
                    return true;
                }
            }
        }
        return false;
    }

    private static void find(final int[][] source,  final int target){
        int length = source.length;
        for (int i = 0; i < length; i++) {
            final int a = i;
            new Thread(()-> {
                for(int j = 0;j < source[a].length; j++){
                    if(source[a][j] == target){
                        LOG.info("找到了,位置：{}" , a +""+ j);
                    }
                }
            }).start();
        }

    }

    //线程池联系
    private static void test(){
        ExecutorService pool = Executors.newFixedThreadPool(5);// 创建一个固定大小为5的线程池
        BlockingDeque blockingDeque = new LinkedBlockingDeque();
        blockingDeque.add("ddd");
        ArrayBlockingQueue<Integer> integers = new ArrayBlockingQueue<Integer>(2);

        Executors.newCachedThreadPool();// 创建一个固定大小为5的线程池Executors
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool(2);// 创建一个固定大小为5的线程池Executors
        for (int i = 0; i < 10; i++) {
            pool.submit(new MyThread());
        }
        String a = "dd".replace("d", "a");
        pool.shutdown();

    }

}
class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}
