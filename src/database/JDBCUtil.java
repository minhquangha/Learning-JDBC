package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection c = null;

        try{
            //DDang ky MySql Driver voi Driver Manager
            com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://localhost:3306/nhasach";
            String username = "root";
            String password = "";

            //Tao ket noi
            c= DriverManager.getConnection(url,username,password);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return c;
    }

    public static void close(Connection c){
        try{
            if(c!=null){
                c.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void printInFo(Connection c){
        try{
            if(c!=null){
                DatabaseMetaData mtdt =c.getMetaData();
                System.out.println(mtdt.getDatabaseProductName());
                System.out.println(mtdt.getDatabaseProductVersion());
                System.out.println(mtdt.getDriverName());
                System.out.println(c.getMetaData().toString());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
