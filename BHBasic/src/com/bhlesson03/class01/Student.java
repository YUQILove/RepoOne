package com.bhlesson03.class01;

public class Student {
    private String name;//姓名
    private int age;//年龄
    static String room;//所在教室

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

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Student() {
    }
}
