package connect_db;

import connect_db.DbHelper;

import javax.xml.transform.Result;
import java.sql.*;
import java.time.LocalDate;

public  class Ab01 {



            public static void main(String[] args) throws SQLException {
                Connection connection= null;
                DbHelper helper=new DbHelper();
                Statement statement=null;
                ResultSet resultSet;
                try{

                    connection= helper.getConnection();



                    resultSet=statement.executeQuery("SELECT name from world_x");
                    while (resultSet.next());
                    System.out.println(resultSet.getString("name"));


                }catch(SQLException e){
                   helper.showErrorMessage(e);
                } finally  {
                   connection.close();
                }

            }
}