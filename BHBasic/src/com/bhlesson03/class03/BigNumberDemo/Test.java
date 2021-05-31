package com.bhlesson03.class03.BigNumberDemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * BigInteger类
 * BinInteger:可以让超Integer范围内的数据进行运算。
 *
 * BigDecimal类
 * BigDecimal:由于在运算的时候，float类型和double很容易丢失精度，为了能精确的表示、计算浮点数，
 * Java提供了BigDecimal,不可变的、任意精度的有符号十进制数。
 *
 * DecimalFormat类
 * DecimalFormat: Java 提供DecimalFormat类，帮你用最快的速度将数字格式化为你需要的样子。
 * 例如，取2位小数。
 **/
public class Test {
    public static void main(String[] args) {
        //大整数运算
        //BigInteger 方法运用
        String val1 = "9823748923472985629423";
        String val2 = "8293847293842983472983";
        BigInteger b1 = new BigInteger(val1);
        BigInteger b2 = new BigInteger(val2);

        System.out.println(b1.add(b2));// + 运算
        System.out.println(b1.subtract(b2));// - 运算
        System.out.println(b1.multiply(b2));// * 运算
        System.out.println(b1.divide(b2));// / 运算
        System.out.println(b1.remainder(b2));// % 运算
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));//  / and % 运算在一起

        /*--------------------------------------------------------------------------------------*/

        //BigDecimal 方法运用
        String val3 = "9823.748923472985629423";
        String val4 = "2";
        BigDecimal b3 = new BigDecimal(val3);
        BigDecimal b4 = new BigDecimal(val4);

        System.out.println(b3.add(b4));
        System.out.println(b3.subtract(b4));
        System.out.println(b3.multiply(b4));
        //除不尽会报ArithmeticException类错误：Non-terminating decimal expansion; no exact representable decimal result.
        System.out.println(b3.divide(b4));//可以出除尽则不报错

        /*--------------------------------------------------------------------------------------*/

        //DecimalFormat类运用
        double pi = 3.1415927;//日周率
        //取一位整数，结果: 3
        System.out.println(new DecimalFormat("0" ).format(pi));
        //取一位整数和两位小数，结果3.14
        System.out.println(new DecimalFormat("0.00" ).format(pi));
        //取两位整数和三位小数，監数不足部分以0填补，结果: 03.142
        System.out.println(new DecimalFormat("00.000").format(pi));
        //取所有整数部分，结果: 3
        System.out.println(new DecimalFormat("#").format(pi));
        //以百分比方式计数，并取两位小数，结果: 314.16%
        System.out.println(new DecimalFormat("#.##%").format(pi));
        //以模板模式输出数据
        long num = 23894729;
        System.out.println(new DecimalFormat("###,###").format(num));



    }
}
