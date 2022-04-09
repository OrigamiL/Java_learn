package com.wf;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class OrderByTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入排序模式：");
        //String sort = "order by "+scanner.nextLine()+"";
        String sort = scanner.nextLine();
        if ("asc".equals(sort)) {
            sort = "order by empno asc";
        }
        else if ("desc".equals(sort)) {
            sort = "order by empno desc";
        }
        else{
            System.out.println("输入有误");
            System.exit(-1);
        }
        ResourceBundle bundle = ResourceBundle.getBundle("com.wf.test");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String name = bundle.getString("name");
        String password = bundle.getString("password");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,name,password);
            stmt = conn.createStatement();
            String sql = "select * from emp "+sort+"";
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

