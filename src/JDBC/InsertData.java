package JDBC;
import java.sql.*;
public class InsertData {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/infotest";
            String USERNAME = "root";
            String PASSWORD = "";
            String CREATE = "create table userInfo(Id int(20) primary key auto_increment, Name varchar(25) not null, " +
                    "City varchar(10) not null)";
            String INSERT = "insert into userInfo(Name, City) values (?, ?)";

            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            Statement stm = conn.createStatement();
//            stm.executeUpdate(CREATE);
            PreparedStatement prpstm = conn.prepareStatement(INSERT);
            prpstm.setString(1, "Asif");
            prpstm.setString(2, "Lucknow");
            prpstm.executeUpdate();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
