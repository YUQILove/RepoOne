package com.bhlesson01.class06;
/*

使用数组作为方法参数，构建一个数组遍历方法方便调用
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值

 */
public class ArrayUse05 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {10,20,30};
        printArray(a);
        System.out.println("hello");
        printArray(b);
        System.out.println("array");

    }
    /*三要素
    返回值类型：void
    方法名称：printArray
    参数列表：int[] array
     */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
