package com.bhlesson01.class05;
/*
数组的概念，一种容器用于储存多个数据值

数组的特点：
1.数组是一种引用数据类型
2.数组当中的多个数据类型必须统一
3.数组的长度在程序运行期间不可改变

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值

两种常见的初始化方式：
1.动态初始化(指定长度)(在创建数组的时候，直接指定数组当中你的数据元素个数)
2.静态初始化(指定内容)(在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定)

动态初始化数组的格式：
  数据类型[] 数组名称 = new 数据类型[数组长度];

  含义：
  左侧数据类型：也就是数组当中保存的数据，全都是统一的什么类型；
  左侧的中括号：代表我是一个数组；
  左侧数组名称：给数组取一个名字；
  右侧的new：代表创建数组的动作；
  右侧数据类型：必须与左边的数据类型保持一致；
  右侧中括号的长度：也就是数组当中，到底可以保存多少个数据，是一个int数字

  使用动态初始化数组的时候，其中的元素会自动拥有一个默认值
  整数类型默认为0；
  浮点类型漠然为0.0；
  字符类默认为'反斜杆u000';
  布尔类型默认为false;
  引用类型默认为null；
  注意：其实静态初始化也有默认值的过程，只不过系统自动马上将默认值替换为了大括号中的值

静态初始化数组的格式：
  基本格式：
     数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，...};
  省略格式：
     数据类型[] 数组名称 = {元素1，元素2，...};
  注意：
   1.虽然静态初始化没有直接告诉长度，但是更具大口号里面的元素确定长度。
   2.静态初始化的标准格式可以拆分为两个步骤；
   3.动态初始化也可以拆分成两个步骤；
   4.静态初始化拆分为两个步骤不能使用省略格式；

使用建议：
不确定数组当中的具体内容用动态初始化，否则已经确定的内容用静态初始化

访问数组元素的格式：
   数组名称[索引值]
   说明：
   索引值就是一个int数字，代表数组当中元素的编号；
   索引值从0开始，到数组长度-1为止；
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //动态初始化
        //创建一个数组，里面可以存放10个int数据
        //格式：数据类型[] 数组名称 = new 数据类型[数组长度];
        int [] arrayA = new int[10];

        //创建一个数组，存放10个double类型的数据
        double[] arrayB = new double[10];

        //创建一个数组，存放10个字符串；
        String[] arrayC = new String[10];

        //静态初始化
        //格式：数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，...}
        //虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素确定长度。
        int[] arrayD = new int[]{1,2,3,4};
        //省略格式：
        int[] arrayE = {1,2,3,4};

        //拆分
        //静态初始化
        int[] arrayF;
        arrayF = new int[]{1,2,3,4};
        //动态初始化
        int[] arrayG;
        arrayG = new int[10];
        //错误格式不能省略
        // int[] arrayH;
        //arrayH = {1,2,3,4}
    }
}
