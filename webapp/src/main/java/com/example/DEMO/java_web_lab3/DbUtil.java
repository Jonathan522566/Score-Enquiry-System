package com.example.DEMO.java_web_lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static Connection getCon(String dbDri,String dbUrl,String dbUsername,String dbPassword){
        Connection connection=null;
        try{
            Class.forName(dbDri);   //驱动器
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
