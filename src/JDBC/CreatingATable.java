package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingATable {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/infotest";
            String userName = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, userName, password);

            String create = "create table table1(ID int(20) primary key auto_increment, Name varchar(30) not null)";
            Statement stm =  conn.createStatement();
            stm.executeUpdate(create);
            System.out.println("Table Created Successfully");
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
