package com.bhlesson02.class03;
/*
构造方法：
构造方法是专门用来创造对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。
格式：
public 类名称(参数类型 参数名称){
   方法体
}

注意事项：
1.构造方法的名称必须和所在类名称完全一样，就连大小写也要一样
2.构造方法不要写返回值类型，连void都不写
3.构造方法不能ruturn一个具体的返回值
4.如果没有编写任何构造方法，默认有一个无参数无方法体的构造方法
5.一旦编写了至少一个构造方法，那么编译器使用你写的构造方法
6.构造方法也是可以进行重载的
 */
/*
定义一个标准的类

一个标准的类通常要拥有先四个组成部分

1.所有的成员变量的都要使用private关键字修饰
2.为每一个成员变量编写一堆Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法

 */
public class Student {
    //1:
    private String name;
    private int age;

    //3:
    public Student() {
    }

    //4:
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //2:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
