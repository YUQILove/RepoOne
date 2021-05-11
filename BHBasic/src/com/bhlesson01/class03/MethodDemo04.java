package com.bhlesson01.class03;
/*
对比有返回值和无返回值
1.定义一个方法，用来【求出】两个数字和
2.定义一个方法，用来【打印】两个数字和

注意事项：
对于有返回值的方法，可以使用单独调用、打印调用或者赋值调用
但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用
ps：
方法的三种调用格式：
  1.单独调用：方法名称(参数);
  2.打印调用：System.out.println(方法名称(参数));
  3.赋值调用：数据类型 变量名称 = 方法名称(参数);
 */
public class MethodDemo04 {
    public static void main(String[] args) {
        //我是main方法，我来调用你
        //我调用你，你来了帮我计算一下，算完了之后，把结果告诉我的num变量
        int num = getSum(10,10);
        System.out.println("输出结果为"+num);
        printSum(10,20);
        /*
        对于void没有返回值的方法,只能单独调用，不能打印或赋值调用
        System.out.println(printSum(1,1));//错误写法！
        System.out.println(void);
        int a = printSum(1,1);//错误写法！
        int a= void;
        */
    }
    //我是一个方法，负责两个数字相加
    //我有返回值int，谁调用我，我就把计算结果告诉谁
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }
    //我是一个方法，负责两个数字相加
    //我没有返回值，不会吧结果告诉任何人，而是我自己进行打印输出
    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println("输出结果为"+result);
    }

}
