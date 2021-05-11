package com.bhlesson01.class03;
/*
题目要求：
定义一个方法，打印指定次数的helloworld。
 */
public class MethodTest03 {
    public static void main(String[] args) {
        isPrint(3);
    }
    /*
    三要素：
    返回值类型：进行打印操作不需要返回值
    方法名称：isPrint
    参数列表：打印次数int
     */
    public static void isPrint(int num){
        for (int i=0;i<num;i++){
            System.out.println("Hello!");
        }
    }
}
