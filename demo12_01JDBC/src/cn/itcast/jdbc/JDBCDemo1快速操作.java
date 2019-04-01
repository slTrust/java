package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class JDBCDemo1快速操作 {
    public static void main(String[] args) throws Exception {

        //1. 导入驱动jar包
            // 如果是 intelliJ 点击 File -> Project Structure 选中你的module 选择 "+" 添加你的jar包
            // mac 默认安装的是 8.0mysql 所以会报错
            // 本代码是 5.x版本 mysql jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "831015");
//        Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "831015");
        //4.定义sql语句
//        String sql = "update account set balance = 2000 where id = 1";
        String sql = "update account set balance = 2000";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();

    }
}
