package com.bhlesson01.class04;
/*
对于功能类似的方法来说，因为参数列表不一样，却需要那么多不同的方法名称，太麻烦。

方法的重载(Overload):多个方法的名称一样，但是参数列表不一样；
好处：只需要记住唯一的一个方法名称就能实现类似的多个功能；

方法重载与下列因素相关：
1.参数的个数不同；
2.参数类型不同；
3.参数的多类型顺序不同；

方法重载与下列因素无关：
1.与参数的名称无关；
2.与方法的返回值类型无关；

 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum1(1,2));//3
        System.out.println(sum2(1,2,3));//6
        System.out.println(sum3(1,2,3,4));//10
        //方法的重载
        System.out.println(sum(1,2));//3
        System.out.println(sum(1,2,3));//6
        System.out.println(sum(1,2,3,4));//10
    }
    public static int sum1(int a,int b){
        return a + b;
    }
    public static int sum2(int a,int b,int c){
        return a + b + c;
    }
    public static int sum3(int a,int b,int c,int d){
        return a + b + c + d;
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(double a,double b){
        return (int)(a + b);
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        return a + b + c + d;
    }
}
