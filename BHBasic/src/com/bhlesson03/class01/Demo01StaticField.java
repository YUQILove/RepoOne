package com.bhlesson03.class01;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("袁一琦",19);
        Student two = new Student("戴萌",20);
        Student.room = "SNH48";
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(Student.room);

        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Student.room);

    }
}
