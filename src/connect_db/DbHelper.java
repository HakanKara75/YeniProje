package connect_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {


    static  String username="root1";
    static String password="12345A.";
    static String dbUrl="jdbc:mysql://localhost:3306/world_x";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, username,password);
    }

    public void showErrorMessage(SQLException exception){

        System.out.println("Error :"+ exception.getMessage());
        System.out.println("Error code : "+ exception.getErrorCode());
    }

}
