package com.bhlesson02.class05;

import java.util.ArrayList;

/*
ArrayList当中的常用方法；

public boolean add(E e){}:向集合当中添加元素，参数的类型和泛型一直；
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用；
     但是对于其他集合(今后学习)来说，add添加动作不一定成功。
public E get(int index){};从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
public E get remove(int index){};从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素；
public int size(){};获取集合的尺寸长度，返回值是集合中包含的元素个数；
 */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加元素：add
        boolean success = list.add("叶舒华");//添加一个元素并获取返回值
        System.out.println(list);
        System.out.println("添加的动作是否成功："+success);//success为true
        //不需要获取返回值也能成功添加
        list.add("宋雨琦");
        list.add("赵美延");
        list.add("全昭妍");
        list.add("金米妮");
        list.add("徐穗珍");
        System.out.println(list);//[叶舒华, 宋雨琦, 赵美延, 全昭妍, 金米妮, 徐穗珍]

        //从集合中获取元素：get
        //索引值从0开始
        String name = list.get(0);
        System.out.println("集合中第一个名字是："+name);

        //从集合中你删除元素：remove
        String remove = list.remove(0);//删除集合中第一个元素，并获取第一个元素的值作为返回值
        System.out.println("被删除的元素是"+remove);
        System.out.println(list);//打印删除元素之后的列表

        //获取集合的长度尺寸，也就是其中元素的个数
        int size  = list.size();
        System.out.println("集合的长度是"+size);
    }
}
