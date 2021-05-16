package com.bhlesson02.class01;
/*
  使用对象类型作为方法的返回值
 */
public class demo03 {
    public static void main(String[] args) {
        Student two = getStudent();
        System.out.println(two.name);
        System.out.println(two.age);
    }
    public static Student getStudent(){
        Student one = new Student();
        one.name = "宋雨琦";
        one.age = 18;
        return one;
    }
}
