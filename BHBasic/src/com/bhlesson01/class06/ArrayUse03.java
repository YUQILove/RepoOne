package com.bhlesson01.class06;

public class ArrayUse03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            //如果当前元素，比max更大则换人
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值为"+max);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值为"+min);
     }
}
