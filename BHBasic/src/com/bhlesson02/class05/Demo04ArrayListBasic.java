package com.bhlesson02.class05;

import java.util.ArrayList;

/*
如果希望向结合ArrayList当中存储基本数据类型，必须使用基本类型对应的"包装类"
基本类型     包装类
byte         Byte
short        Short
int          Integer 【特殊】
long         Long
float        Float
double       Double
char         Character  【特殊】
boolean      Boolean
 */
public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        //错误写法！泛型只能是引用类型，不能是基本类型
       //ArrayList<int> list = new ArrayList<>();

        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        System.out.println(listA);
        int num = listA.get(0);
        System.out.println("第一个元素是"+num);
    }
}
