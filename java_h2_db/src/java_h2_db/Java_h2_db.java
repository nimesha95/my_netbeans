/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_h2_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nimesha
 */
public class Java_h2_db {

    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:/C:\\Users\\amarasena\\Documents\\NetBeansProjects\\java_h2_db/h2test","test","test");
            Statement st = conn.createStatement();
            st.execute("create table pawn (name varchar(20))");
            System.out.println("Table created sucessfully");
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Java_h2_db.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
}
