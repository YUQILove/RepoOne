package com.bhlesson01.class02;

/*定义格式：
     数据类型[] 数组名;
     举例：int arr[];
  数组初始化：
     A：初始化就是为数组中的数组元素分配内存空间，并未每个数组元素赋值
     B：数组初始化分为：
        静态初始化
        动态初始化
   动态初始化：
      初始化时只指定数组长度，由系统为数组分配初始值
      格式：数据类型[] 变量名 = new 数据类型[数组长度];
      举例：int [] arr = new int[3];

 */
public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr = new int[3];
    /*
       左边：
            int：说明数组中的元素类型；
            []:说明这是一个数组；
            arr：说明数组名称；
       右边：
            new：为数组申请内存空间：
            int：说明数组中的元素类型；
            []:说明这是一个数组；
            3：说明数组长度，就是数组中的元素个数；

     */
        System.out.println(arr);
    }
}
