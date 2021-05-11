package com.bhlesson01.class03;
/*
题目要求：
定义一个方法，用来求出1-100之间的数字的和值。
 */
public class MethodTest02 {
    public static void main(String[] args) {
        System.out.println("结果是"+getSum());
    }
    /*
     三要素：
     返回值类型：有返回值，int类型
     方法名称：getSum
     参数列表：数据范围已经确定，不需要参数
    */
    public static int getSum(){
        int sum = 0;
        for (int i=1;i<=100;i++){
            sum += i;
        }
        return sum;
    }
}
