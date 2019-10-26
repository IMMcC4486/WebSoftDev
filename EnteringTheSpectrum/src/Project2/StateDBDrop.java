package Project2;

// File: StateDBDrop.java
// Remove State Database

import java.io.*;
import java.sql.*;

public class StateDBDrop {

  private static final String USERNAME = "spiegel";
  private static final String PASSWORD = "legeips";



public static void main(String[] args) throws java.io.IOException
{
 // Set up JDBC stuff
 Statement stmnt;
 try {
   Connection con = new OracleConnection().getConnection(USERNAME, PASSWORD);
   stmnt=con.createStatement();
   
   // We can remove the table (use when table needs to go)
   stmnt.executeUpdate("DROP TABLE States");
   stmnt.close();
 }
 catch (Exception e) {
   e.printStackTrace();
 }
}

}




