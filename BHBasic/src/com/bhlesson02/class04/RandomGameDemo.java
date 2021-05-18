package com.bhlesson02.class04;

import java.util.Random; //导包
import java.util.Scanner;

/*
题目：
用代码模拟猜数字的小游戏

思路：
1.首先需要产生一个随机数字，并且一旦产生不再变化
2.需要键盘输入，所以泳道了Scanner
3.获取键盘输入的数字，用Scanner当中的nextInt方法
4.已经得到了两个数字，判断(if)一下
    如果太大了，提升太大，并且重试
    如果太小了，提示太小，并且重试
    如果猜中了，游戏结束
5.重试就是再来一次，循环次数不确定，用while(true)
 */
public class RandomGameDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入一个数字");
            int inputNum  = sc.nextInt();

            if (inputNum > randomNum){
                System.out.println("猜大了");
            }else if (inputNum < randomNum){
                System.out.println("猜小了");
            }else if (inputNum == randomNum) {
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("游戏运行结束");

    }
}
