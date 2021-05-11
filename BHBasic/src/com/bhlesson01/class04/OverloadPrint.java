package com.bhlesson01.class04;
/*
byte short int long float double char boolean
String
在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式。
按住ctrl ，鼠标点击println方法可以查看
 */
public class OverloadPrint {
    public static void main(String[] args) {
        myPrint(10);//int
        myPrint("hello");//String
    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(String num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(char num){
        System.out.println(num);
    }
    public static void myPrint(boolean num){
        System.out.println(num);
    }
}
