package com.bhlesson02.class06;

import sun.plugin2.gluegen.runtime.StructAccessor;

/*
字符串的截取方法:

public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串

备注：[begin,end) 包含左边，不包含右边

 */
public class Demo4Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//HelloWorld,原封不动
        System.out.println(str2);//World,新字符串

        String str3 = str1.substring(4,7);
        System.out.println(str3);//oWo

        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java
    }
}
