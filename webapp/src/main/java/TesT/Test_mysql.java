package TesT;

import java.sql.*;

public class Test_mysql {
    public static Connection conn;
    public static String drive="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/java_web_lab3?serverTimezone=Asia/Shanghai&useSSL=false";
    public static String user ="root";
    public static String password = "123456";

    public static Connection getConn(){
        try{
            Class.forName(drive);
            conn= DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //数据库的关闭
    public static  void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs){
        if (conn!=null){
            try{
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt!=null){
            try{
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try{
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test_mysql t1=new Test_mysql();
        t1.getConn();
    }
}
