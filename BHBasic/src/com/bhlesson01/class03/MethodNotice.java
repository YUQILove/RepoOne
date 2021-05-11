package com.bhlesson01.class03;
/*
使用方法的注意事项：
   1.方法应该定义在类中，但是不能在方法当中在定义方法。不能嵌套；
   2.方法定义的前后顺序无所谓；
   3.方法定义之后不会执行，如果希望执行，一定要调用：单独调用、打印调用、赋值调用；
   4.如果方法有返回值，那么必须写上"return 返回值;",不能没有
   5.return后面的返回值数据，必须和方法的返回值类型对应；
   6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己；
   7.对于方法当中年最后一行的return可以省略不写；
   8.一个方法中可以有多个return语句，但是必须保证同时只会有一个能执行到；
 */
public class MethodNotice {
   public static int method1(){
       return 10;
   }
   public static void method2(){
       //return 10;//错误！
       return;//用来结束方法
   }
   public static void method3(){
       System.out.println("aaa");
       System.out.println("bbb");
       //return;//最后一行的return可以省略不写。
   }
   public static int method4(int a ,int b){
       if (a > b){
           return a;
       }else
           return b;
   }
}
