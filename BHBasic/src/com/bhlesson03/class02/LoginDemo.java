package com.bhlesson03.class02;

import java.util.Scanner;

/*用户登入类*/
public class LoginDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = input.nextLine();
        System.out.println("请输入密码：");
        String password = input.nextLine();

        UserService userService = new UserService();
        try {
            User user = userService.login(name, password);
            System.out.println(user.toString());
            System.out.println("登入成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
