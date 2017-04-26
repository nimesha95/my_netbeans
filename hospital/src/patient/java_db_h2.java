/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

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
public class java_db_h2 {
    public static void main(String args[]){
        Connection();
    }
    
    public static void Connection(){
        String DB_loc="jdbc:h2:C:\\Users\\amarasena\\Documents\\NetBeansProjects\\hospital\\db/patient";
        String DB_usr_name = "test";
        String DB_pw="test";
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection(DB_loc,DB_usr_name,DB_pw);
            Statement st = conn.createStatement();
            //st.execute("INSERT INTO LOGIN (USERNAME,PASS) VALUES ('intake','0000')");
            
            /*
            Statement st = conn.createStatement();
            st.execute("CREATE TABLE IF NOT EXISTS patients(id int NOT NULL AUTO_INCREMENT,"
                    + "Fname varchar(255), Lname varchar(255),"
                    + "NIC varchar(255),phone int,Address varchar(255),Email varchar(255),Emergency_C int,conts_id int,"
                    + "const_name varchar(255),PRIMARY KEY(id))");
            System.out.println("Table created sucessfully");
            //st.execute("CREATE TABLE IF NOT EXISTS Employee(id int)");
            st.execute("INSERT INTO patients(FNAME,LNAME,NIC,PHONE,ADDRESS,EMAIL,"
                + "EMERGENCY_C,CONTS_ID,CONST_NAME) values ('Nimesha','Kalinga','952470574V',0775635458,'54/31A','nimesha95@live.com',0775635458,15,'doctor do little');");
            //String ba="Employee";
            //st.execute("INSERT INTO "+ba+" values (65)");
            */
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(java_db_h2.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
