package com.wf;

import java.sql.*;
import java.util.*;

public class userLogin {
    public static void main(String[] args) {

        //boolean exist = false;
        boolean verifyLogin = false;
        while (!verifyLogin) {
            Map<String, String> userInfo = initUI();
            verifyLogin = verifyLogin(userInfo);

            if (verifyLogin)
                System.out.println("登陆成功！");
            else
                System.out.println("密码错误");
        }

    }

    private static Map<String, String> initUI() {
        Map<String, String> map = new HashMap<>();
        System.out.println("欢迎使用本系统");
        System.out.println("==============");
        System.out.println("请输入用户名：");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        map.put("loginName", username);
        map.put("loginPwd", password);
        return map;
    }


    private static boolean verifyLogin(Map<String, String> userInfo) {
        String username = userInfo.get("loginName");
        String password = userInfo.get("loginPwd");
        boolean login = false;
        ResourceBundle bundle = ResourceBundle.getBundle("com.wf.jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String pwd = bundle.getString("password");
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pwd);

            String sql = "select loginName,loginPwd from t_user where loginName = ? and loginPwd = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if(rs.next())
                login = true;
            /*while (rs.next()) {
                if (rs.getString("loginName").equals(username)) {
                   // exist = true;
                    if (rs.getString("loginPwd").equals(password)) {
                        login = true;
                    }
                }
            }*/
            /*if (!exist) {
                System.out.println("用户名不存在");
                continue;
            }*/


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
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
        return login;
    }
}
