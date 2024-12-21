/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_registration;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;



/**
 *
 * @author romme
 */
public class DatabaseConnection {
    
    
    Connection con;
    
    public static void Connect(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
