package com.bhlesson02.class02;
/*
   面向对象三大特征：封装、继承、多态

   封装性在Java中的体现：
   1.方法就是一种封装
   2.关键字private也是一种封装

   封装就是将一些细节信息隐藏起来，对于外界不可见
 */
public class Demo01 {
    public static void main(String[] args) {
        Person person  = new Person();
        person.show();

        person.name = "yuqi";
        //person.age = -20;//错误写法！！直接访问private数据
        person.setAge(20);//正确写法
        person.show();
    }

}
