/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Umesh
 */
public class ConnectionProvider {
    private static Connection conn;
    public static Connection getConn()
    {
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","saugat","saugat11");
   
    }
    catch(Exception e) {
   e.printStackTrace();
    }
    
     return conn;
    }

    
}
