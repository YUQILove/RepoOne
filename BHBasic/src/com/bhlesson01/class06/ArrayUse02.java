package com.bhlesson01.class06;
/*
数组的遍历

遍历数组就是对数组当中你的每一个源氏进行逐一的处理。默认的处理方式就是打印输出
 */
public class ArrayUse02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        //首先使用原始方式；
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        //使用循环，次数其实就是数组的长度
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
        //快捷代码：
        // array.fori
    }
}
