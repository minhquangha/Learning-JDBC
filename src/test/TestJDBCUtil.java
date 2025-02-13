package test;

import database.JDBCUtil;

import java.sql.Connection;

public class TestJDBCUtil {
    public static void main(String[] args) {
        Connection connection = JDBCUtil.getConnection();
        System.out.println(connection);
        JDBCUtil.printInFo(connection);
        JDBCUtil.close(connection);
        System.out.println(connection);


    }
}
