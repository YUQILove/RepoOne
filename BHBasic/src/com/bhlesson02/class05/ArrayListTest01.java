package com.bhlesson02.class05;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历

思路：
1.自定义Student学生类,四个部分；
2.创建一个集合，用来存储学生对象，泛型<Student>
3.根据类，创建4个学生对象；
4.将4个学生对象添加到集合中：add
5.遍历集合：for,size,get
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Student> list  = new ArrayList<>();

        Student one = new Student("宋雨琦",21);
        Student two = new Student("叶舒华",20);
        Student three = new Student("金泰妍",18);

        list.add(one);
        list.add(two);
        list.add(three);
        
        //遍历集合
        for (Student stu : list) {
            System.out.println("姓名：" + stu.getName() + "  年龄：" + stu.getAge());
        }
    }
}
