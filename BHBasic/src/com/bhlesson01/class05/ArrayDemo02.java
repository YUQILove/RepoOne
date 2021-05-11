package com.bhlesson01.class05;
/*
访问数组元素的格式：
  数组名称[索引值]
   索引值就是一个int数字，代表数组当中元素的编号；
   索引值从0开始，到数组长度-1为止；
 */

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {1,2,3};
        System.out.println(array);//[I@1b6d3586 内存地址

        System.out.println(array[0]);//1
        System.out.println(array[1]);//2
        System.out.println(array[2]);//3

        int num = array[1];//将数组中的单个元素赋值给变量sum
        System.out.println(num);

        //动态初始化
        //使用动态初始化数组的时候，其中的元素会自动拥有一个默认值
        /*
        整数类型默认为0；
        浮点类型漠然为0.0；
        字符类默认为'反斜杆u000';
        布尔类型默认为false;
        引用类型默认为null；
         */
        int[] array1 = new int[3];
        System.out.println(array1);
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
    }

}
