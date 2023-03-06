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
                    statement=connection.prepareStatement(
                            "insert into sakila.actor(first_name) values (Tarik)");


                    resultSet=statement.executeQuery("SELECT first_name from sakila.actor");
                    while (resultSet.next());
                    System.out.println(resultSet.getString("first_name"));


                }catch(SQLException e){
                   helper.showErrorMessage(e);
                } finally  {
                   connection.close();
                }

            }
}