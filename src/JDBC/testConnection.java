package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class testConnection {

    public static void main(String[] args) {
        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/infotest";
        String userName = "root";
        String password = "";
        try{
            Class.forName(className);
            Connection conn = DriverManager.getConnection(url, userName, password);

            if (conn.isClosed()){
                System.out.println("Connection is Closed");
            }else{
                System.out.println("Connection is Open");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
