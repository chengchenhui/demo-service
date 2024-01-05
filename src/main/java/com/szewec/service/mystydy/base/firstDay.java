package com.szewec.service.mystydy.base;

/**
 * 算法： 获取101~200之间有多少个质数，并分别打印出来
 *
 * 本章中有一个快捷键： ctrl+alt+m  公共方法快捷提取
 */
public class firstDay {

    public static void main(String[] args) {
        //拿到101-200之间的质数

        //统计变量
        int count = 0;
        //质数标记: 默认当前数字是一个质数
        count = getCount(count);

        System.out.println("101~200之间一共有" + count + "个质数。");
    }

    private static int getCount(int count) {
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                //质数判断条件： 只能被1 和 本身整除
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i + "是一个质数");
                count++;
            }
        }
        return count;
    }


}
