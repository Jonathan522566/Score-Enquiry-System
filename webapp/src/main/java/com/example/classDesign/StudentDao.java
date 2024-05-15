package com.example.classDesign;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    // 查询所有的学生信息

    public List getAllStudent() {
        List List = new ArrayList();
        Connection conn = DBCon.getConn();
        String sql = "select * from sinfo";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setStudentNumber(rs.getString("studentNumber"));
                s.setStudentName(rs.getString("studentName"));
                s.setStudentClass(rs.getString("studentClass"));
                s.setStudentMajor(rs.getString("studentMajor"));
                s.setStudentAge(rs.getString("studentAge"));
                List.add(s);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return List;
    }

    // 增添学生信息
    public boolean addStudent(Student s) {
        String sql = "insert into sinfo(studentNumber,studentName,studentClass,studentMajor,studentAge) values(?,?,?,?,?)";
        Connection conn = DBCon.getConn();
        try {

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s.getStudentNumber());
            pstmt.setString(2, s.getStudentName());
            pstmt.setString(3, s.getStudentClass());
            pstmt.setString(4, s.getStudentMajor());
            pstmt.setString(5, s.getStudentAge());

            int count = pstmt.executeUpdate();
            pstmt.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    //修改学生信息
    public boolean updateStudent(Student s) {
        String sql = "update sinfo set studentName=?,studentClass=?,studentMajor=?,studentAge=? where studentNumber=?";
        Connection conn = DBCon.getConn();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s.getStudentName());
            pstmt.setString(2, s.getStudentClass());
            pstmt.setString(3, s.getStudentMajor());
            pstmt.setString(4, s.getStudentAge());
            pstmt.setString(5, s.getStudentNumber());
            int count = pstmt.executeUpdate();
            pstmt.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    // 删除学生信息
    public boolean deleteStudent(String studentNumber) {
        String sql = "delete from sinfo where studentNumber=?";
        Connection conn = DBCon.getConn();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, studentNumber);
            int count = pstmt.executeUpdate();
            pstmt.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public Student selectStudentByNumber(String number) {
        Connection conn = DBCon.getConn();
        String sql = "select * from sinfo where studentNumber="+number;
        Student s = null;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setStudentName(rs.getString("studentName"));
                s.setStudentNumber(rs.getString("studentNumber"));
                s.setStudentClass(rs.getString("studentClass"));
                s.setStudentMajor(rs.getString("studentMajor"));
                s.setStudentAge(rs.getString("studentAge"));
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }

    // 查询基于某个条件的学生信息
    public List selectStudentByName(String studentName) {
        List List = new ArrayList();
        Connection conn = DBCon.getConn();
        String sql = "select * from sinfo where studentName=?";
        Student s = null;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, studentName);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setStudentNumber(rs.getString("studentNumber"));
                s.setStudentName(rs.getString("studentName"));
                s.setStudentClass(rs.getString("studentClass"));
                s.setStudentMajor(rs.getString("studentMajor"));
                s.setStudentAge(rs.getString("studentAge"));
                List.add(s);
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
