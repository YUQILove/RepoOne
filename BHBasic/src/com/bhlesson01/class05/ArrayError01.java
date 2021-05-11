package com.bhlesson01.class05;
/*
数组的索引编号从0开始，一直到数组的长度-1为止；

如果访问数组元素时，索引编号不存在，那么将会发生
数组索引越界异常
ArrayIndexOutOfBoundsException
 */

public class ArrayError01
{
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //数组索引越界异常
        //System.out.println(array[3]);
    }
}
