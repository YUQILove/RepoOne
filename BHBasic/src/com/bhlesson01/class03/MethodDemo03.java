package com.bhlesson01.class03;
/*
有参数:小括号中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。
例如两个数字相加，必须知道两个数字各自多少，才能相加。

无参数：小括号中无内容，当一个方法不需要任何数据条件，就能完成任务的时候，就是无参数。
 */
public class MethodDemo03 {
    public static void main(String[] args) {
        method1(10,10);
        method2();
    }
    //有参数
    //两个数字相加，必须知道两个数字的值，否则无法进行计算
    public static void method1(int a ,int b){
        int result = a + b;
        System.out.println(result);
    }
    //无参数
    //例如打印一些文字
    public static void method2(){
        for (int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
}
