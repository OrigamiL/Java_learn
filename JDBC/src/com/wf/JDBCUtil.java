package com.wf;

import java.sql.*;

public class JDBCUtil {
    private JDBCUtil() {
    }

    /*
      静态代码块注册驱动
     */
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return  数据库连接
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/zhezhi?serverTimezone=UTC&useSSL=false","root","294753qQ");
    }

    /**
     *
     * @param conn 连接对象
     * @param ps 操作对象
     * @param rs 结果集
     */

    public static void close(Connection conn, Statement ps, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
