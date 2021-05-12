package com.bhlesson01.class06;

import java.util.Arrays;

/*
获取数组的长度
格式：
数组名称.length

这样会得到一个int数字代表数组的长度；
 */
public class ArrayUse01 {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int len = arrayA.length;
        System.out.println(len);

        int[] arrayB = {1,2,3};
        System.out.println(arrayB.length);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[4];
        System.out.println(arrayC.length);
    }
}
