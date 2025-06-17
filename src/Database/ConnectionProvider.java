/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.*;

/**
 *
 * @author Zak Andalion
 */
public class ConnectionProvider {

    /**
     *
     * @return
     */
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "Admin", "A1v!0_E9");
            return con;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
