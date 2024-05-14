package com.example.classDesign;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // 增添用户信息
    public boolean addUser(User u) {
        String sql = "insert into regist(name,ipone,password) values(?,?,?)";
        Connection conn = DBCon.getConn();
        try {

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, u.getName());
            pstmt.setString(2,u.getIphone());
            pstmt.setString(3,u.getPassword());

            int count = pstmt.executeUpdate();
            pstmt.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    // 查询基于某个条件的用户信息
    public User selectUserByiphone(String ipone) {
        List List = new ArrayList();
        Connection conn = DBCon.getConn();
        String sql = "select * from regist where ipone=?";
        String pass;
        User u=new User();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,ipone);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                u.setPassword(rs.getString("password"));
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return u;

    }

}
