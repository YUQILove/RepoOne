package com.bhlesson01.class03;
/*
方法：
  定义格式
  public static void 方法名(){
     方法体
  }
  调用格式：
   方法名称();
   注意事项：
   1.方法定义先后无所谓；
   2.方法不能嵌套，在一个方法内定义另一个方法；
   3.方法定义之后，自己不会执行；如果需要执行需要调用；
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        printMethod();
        //调用输出内容方法
    }

    public static void printMethod() {
        System.out.println("输出内容");
    }
}
