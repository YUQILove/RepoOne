package com.bhlesson02.class06;
/*
String当中与转换相关的常用方法有：

public char[] toCharArray():
public byte[] getBytes():
public String replace(CharSequence oldString,CharSequence newString):
将所有出现的老字符串替换成为新的字符串,返回替换之后的结果新字符串
备注：CharSequence的意思就是可以接受字符串类型
 */
public class Demo5StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5
        System.out.println("=============");

        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===========");

        //字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===========");

        String lang1 = "会不会玩啊!你大爷的!你大爷的!!你大爷的!!!";
        String lang2 = lang1.replace("你大爷的","****");//将你大爷的替换为****
        System.out.println(lang2);
    }
}
