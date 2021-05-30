package com.bhlesson03.class02;
/**
 * assert关键字，表示断言
 * 当程序执行到某个固定位置的时候，程序中的某个变量的取值肯定是预期的结果，
 * 那么这种操作可以使用断言完成
 *
 * 测试用的
**/
public class AssertDemo {
    public static void main(String[] args) {
        int result = add(10, 10);
        assert result == 10 : "结果不正确";
    }
    private static int add(int a,int b){
        return a+b+1;
    }
}
