/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newProject;
import java.sql.*;

/**
 *
 * @author Mahela Shewon
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/invsys","root","Amount@071");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    
    public static void main(String[] args) {
        Connection con = getCon();
        System.out.println(con);
    }
    
}
