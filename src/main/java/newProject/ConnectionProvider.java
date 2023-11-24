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
        try{
            Class.forName("com.mysql.connecter.Driver");
            Connection con=Driver.Manager.getConnection("connector.mysql://localhost:3306");
        }
        catch(Exception e)
        {}
    }
    
}
