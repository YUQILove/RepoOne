package com.bhlesson02.class05;

import java.util.ArrayList;

public class Demo03ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("宋雨琦");
        list.add("赵美延");
        list.add("全昭妍");
        list.add("金米妮");
        list.add("徐穗珍");
        list.add("叶舒华");

        //遍历结合:快捷键list.fori
        for (String s : list) {
            System.out.println(s);
        }
    }
}
