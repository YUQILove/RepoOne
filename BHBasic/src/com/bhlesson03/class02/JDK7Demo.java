package com.bhlesson03.class02;

import java.io.*;
import java.util.Calendar;

/**JDK7新特性
 *
 **/
public class JDK7Demo {
    public static void main(String[] args) {
        //JDK1.5之后
        //Scanner input = new Scanner(System.in)
        //JDK1.5之前接受控制台输入（直接使用IO流）

        //JDK1.7新特性
        //try实现close()自动关闭IO流
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("请输入数字：");
            String info = br.readLine();
            int num = Integer.parseInt(info);
            System.out.println(info);
            //br.close()
        } catch (IOException|NumberFormatException e) {//可以写并列异常，要是同一类
            e.printStackTrace();
        }
    }

}
