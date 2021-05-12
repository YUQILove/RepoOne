package com.bhlesson01.class06;
/*
数组作为方法的返回值:

一个方法可以有多个参数，但不能同时有多个返回值
如果一个方法当中产生了多个数据需要返回
使用一个数组作为返回值类型即可

任何数据类型都能作为方法的参数类型，或者返回值类型；

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的其实也是数组的地址值
 */
public class ArrayUse06 {
    public static void main(String[] args) {
        int[] a = calculate(1,2,3);
        System.out.println("和"+a[0]);
        System.out.println("平均数"+a[1]);
    }
    public static int[] calculate(int a ,int b ,int c){
        int sum = a + b + c;
        int avg = sum/3;
        //两个结构都希望返回
        //需要一个数组，也就是一个塑料袋，数组可以保存多个结果
         int[] array = {sum , avg};
         return array;
    }
}
