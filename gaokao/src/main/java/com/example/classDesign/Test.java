package com.example.classDesign;

public class Test {
    public static void main(String[] args) {
        //从数据库获取信息
        UserDao uDao=new UserDao();
        User u=new User();
        u=uDao.selectUserByiphone("54321");
        String pass=u.getPassword();

        System.out.println(pass);
    }
}
