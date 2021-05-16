package com.bhlesson02.class01;
/*
使用对象类型作为方法的参数

 */
public class demo02 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "宋雨琦";
        student.age = 18;

        method(student);
    }
    public static void method(Student param){
        System.out.println(param.name);
        System.out.println(param.age);
    }
}
