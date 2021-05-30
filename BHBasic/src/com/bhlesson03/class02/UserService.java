package com.bhlesson03.class02;
/*用户服务类*/
public class UserService {
    public User login(String username, String password) throws Exception{
        if (!"admin".equals(username)) {
            throw new Exception("用户名错误");
        } else if (!"12345".equals(password)) {
            throw new Exception("密码错误");
        }
        return new User("admin", "12345", 18, "男");
    }
}
