import java.sql.*;
import java.util.ResourceBundle;

public class MysqlTest {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
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
            //int count = stmt.executeUpdate("insert into dept(deptno,dname,loc) values(60,'人事部','上海市')");
            rs = stmt.executeQuery("select ename,sal from emp");
            while(rs.next()){
                String ename = rs.getString("ename");
                double sal = rs.getDouble("sal");
                System.out.println(ename+","+(sal+100));
            }
            //System.out.println(count == 1 ? "执行成功":"执行失败");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
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
