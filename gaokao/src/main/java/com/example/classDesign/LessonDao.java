package com.example.classDesign;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {

    //获得全部课程信息
    public List getAllLesson(String studentMajor) {
        List List = new ArrayList();
        Connection conn = DBCon.getConn();
        String sql = "select * from "+studentMajor;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Lesson l=new Lesson();
                l.setKcbh(rs.getString("kcbh"));
                l.setKcmc(rs.getString("kcmc"));
                l.setXf(rs.getString("xf"));
                l.setKcxz(rs.getString("kcxz"));
                List.add(l);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return List;
    }

}
