package com.bhlesson01.class04;
/*
比较两个数据是否相等
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型；
在main方法中进行测试。
 */
public class Overload01 {
    public static void main(String[] args) {
       byte a = 10;
       byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)10,(short)20));
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte参数的方法执行");
        boolean same;
        if (a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }
    public static boolean isSame(short a,short b){
        System.out.println("两个short参数的方法执行！");
        boolean same = a == b?true:false;
        return same;
    }
}
