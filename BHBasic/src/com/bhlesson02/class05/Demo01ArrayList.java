package com.bhlesson02.class05;

import java.util.ArrayList;

/*
数组的长度不可以发生改变，
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型；
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型；
注意：泛型只能是引用类型，不能是基本类型；

注意事项：
   对于ArrayList集合来说，直接打印得到的不是地址值而是内容
   如果内容是空，得到的是空的中括号：[]
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里面装的都是String类型的数据
        //备注：从jdk1.7开始，右侧的尖括号内可以不写内容，但是<>还是要写
        ArrayList<String>  list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加一些数据，需要用到add方法；
        list.add("赵丽颖");
        System.out.println(list);//[赵丽颖]

        list.add("宋雨琦");
        list.add("全昭妍");
        //list.add(10);//错误写法
        System.out.println(list);//[赵丽颖, 宋雨琦, 全昭妍]
    }
}
