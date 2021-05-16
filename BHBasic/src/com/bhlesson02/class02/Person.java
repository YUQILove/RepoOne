package com.bhlesson02.class02;
/*
问题描述：定义Person的年龄时，无法住址不合理的数值被设置进来
解决方案：用private关键字将需要保护的成员变量进行修饰。

一旦使用的private进行修饰，那么本类当中仍然可以随意访问
但是超出了本类范围之外就不能再直接访问了。】

间接访问private成员变量就是定义一堆getter和setter方法
对于Getter来说，不能有参数，返回值类型和成员变量对应；
对于Setter来说，不能有返回值，参数类型和成员变量对应；
 */
public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫"+name+"今年"+age);
    }
    //这个成员方法专门用于对age设置数据
    public void setAge(int num){
        if(num <= 0){
            System.out.println("错误！");
        }else
        age = num;
    }
    //这个方法，专门用于向age设置数据
    public int getAge(){
        return age;
    }
}
