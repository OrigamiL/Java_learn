package com.wf;

import java.sql.*;
import java.util.ResourceBundle;

public class jdbcTest {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("com.wf.jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
           // stmt.executeUpdate("update dept set deptno = 70 where loc = '上海'");
            rs = stmt.executeQuery("select e.ename,d.dname,t.ename,s.grade from emp e join dept d on e.deptno = d.deptno left join emp t on e.mgr = t.empno join salgrade s on e.sal between s.losal and s.hisal where e.sal > (select avg(sal) from emp)");
            System.out.println("e.ename,d.dname,t.ename,s.grade");
            while (rs.next()){

                System.out.println(rs.getString(1)+","+rs.getString(2)+","+
                        rs.getString(3)+","+rs.getString(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
