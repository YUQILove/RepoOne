package com.bhlesson03.class02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**异常处理
 * 1、Throwable是异常的基类，分为Error和Exception，在编程中我们关注Exception
 * 2、Exception分为编译期异常（首检）和运行期异常（分首检）
 * 3、异常会导致程序中断，无法继续执行
 * 4、在开发中，我们需要把可能出现异常的代码使用try语句块
 * 5、处理异常可以让程序保持运行状态
 * 6. catch可以有多个，顺序为子类到父类，大的放后面，小的放前面
 *
 * 异常处理过程分析:
 * (1)、一旦产生异常，则系统会自动产生一个异常类的实例化对象。
 * (2)、此时如果存在了trn语句， 则会自动找到匹配的catch语句执行，如果没有异常处理，则程
 * 序将退出，并由系统报告错误。
 * (3)、所有的catch根据方法的参数匹配异常类的实例化对象，如果匹配成功，则表示由此catch
 * 进行处理。
 *
 * finally关键字:（最多只有一个语句）
 * 在进行异常的处理之后，在异常的处理格式中还有一个finally语句，那么此语句将作为异常
 * 的统一出口，不管是否产生了异常，最终都要执行此段代码。
 *
 * throw 与 throws 关键字:
 * throws关键字主要在方法的声明上使用，表示方法中不处理异常，而交给调用处处理。实际
 * 上对于Java程序来讲，如果没有加入任何的异常处理，默认由JVM进行异常的处理操作。
 * throw关键字表示在程序中手动抛出一个异常，因为从异常处理机制来看，所有的异常一旦
 * 产生之后，实际上抛出的就是一个异常类的实例化对象，那么此对象也可以由throw直接抛出。
 *
 * 当代码出现异常，会产生异常对象( JDK代码或JVM)，
 * 把异常对象传入被匹配的catch中的异常对家变量。
 *
 * 学习的错误异常：
 * 1、ArithmeticException 运算异常
 * 2、ArrayIndexOutOfBoundsException 下标越界
 * 3、NullPointerException 空指针
 * 4、InputMismatchException 输入匹配
 * 5、ClassNotFoundException 找不到类
 * 6、ClassCastException 类型转换错误
 **/
public class Test1 {
    public static void main(String[] args) {
        //div(23,0);

        //method();

        /*try {
            div2(20, 0);
        } catch (Exception e) {//e 就是方法div2()中new出的一个异常：除数不能为0
            e.printStackTrace();
        }
        System.out.println("over");*/

        input();//输入字符串会报错 Exception in thread "main" java.util.InputMismatchException（输入匹配错误）


    }

    /*除法运算*/
    private static void div(int num1, int num2) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);//数组下标越界
            arr = null;
            System.out.println(arr.length);//空指针异常
            int result = num1 / num2;//除数为0
            System.out.println("result=" + result);
        //多个catch块时候，Java虛拟机会匹配其中一个异常类或其子类，就执行这个catch块，而不会再执行别的catch块。
        } catch (ArithmeticException e) {//ArithmeticException只是处理运算的异常
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {//可以处理数组引用问题
            System.out.println("数组下标越界");
        } catch (NullPointerException e) {//空指针异常
            System.out.println("空指针异常");
        } catch (Exception e) {//异常的父类，不知道什么错误类型可以用这个，必须放最后面
            System.out.println("出错了");
        } finally {//不管是否有异常，都会执行
            System.out.println("程序执行完毕！");
        }
        System.out.println("程序结束");
    }

    private static int method(){
        int a = 10;
        int b = 2;
        try {
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            int c = a / b;
            System.out.println("a/b=" + c);
            return c;
        } catch (Exception e) {
            //代码测试使用
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        return -1;
    }
    //throw 和 throws 的使用
    private static int div2(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("除数不能为0");//产生异常对象抛出
        } finally {
            System.out.println("运行结束");
        }
    }
    //输入匹配错误 InputMismatchException
    private static void input(){
        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("输入匹配错误");
        }

    }

}
