/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nimesha
 */
public class Patient extends Person{
    private int Age,Emergency, consult_id;
    private String email, consult_name;
    Patient(String Fname,String Lname,String Address,String NIC,int Phone,
            int Age,int Emergency,int consult_id,String email,String consult_name){
        setFname(Fname);
        setLname(Lname);
        setAddress(Address);
        setNIC(NIC);
        setPhone(Phone);
        setAge(Age);
        setEmergency(Emergency);
        setConst_id(consult_id);
        setEmail(email);
        setConst_name(consult_name);
    }
    
    void setAge(int Age){
        this.Age=Age;
    }
    void setEmergency(int Emergency ){
        this.Emergency=Emergency;
    }
    void setConst_id(int consult_id){
        this.consult_id=consult_id;
    }
    void setEmail(String email){
        this.email=email;
    }
    void setConst_name(String consult_name){
        this.consult_name=consult_name;
    }
    
    
    int getAge(){
        return Age;
    }
    int getEmergency(){
        return Emergency;
    }
    int getConsult_id(){
        return consult_id;
    }
    String getEmail(){
        return email;
    }
    String getConsult_name(){
        return consult_name;
    }
    
    void pushToDB() throws ClassNotFoundException, SQLException{
        //java_db_h2.Connection();
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\amarasena\\Documents\\NetBeansProjects\\hospital\\db/patient","test","test");
        Statement st = conn.createStatement();
        
        st.execute("INSERT INTO patients(FNAME,LNAME,NIC,PHONE,ADDRESS,EMAIL,"
                + "EMERGENCY_C,CONTS_ID,CONST_NAME) values ("
                +"\'"+getFname()+"\'"+",\'"+getLname()+"\'"+",\'"+getNIC()+"\'"+","+getPhone()+",\'"+getAddress()+"\'"+",\'"+getEmail()+"\'"+","
                +getEmergency()+","+getConsult_id()+",\'"+getConsult_name()+"\'"+")");
        System.out.println("Database updated");
        /*
        System.out.println("INSERT INTO patients(FNAME,LNAME,NIC,PHONE,ADDRESS,EMAIL,"
                + "EMERGENCY_C,CONTS_ID,CONST_NAME) values ("
                +"\'"+getFname()+"\'"+",\'"+getLname()+"\'"+",\'"+getNIC()+"\'"+","+getPhone()+",\'"+getAddress()+"\'"+",\'"+getEmail()+"\'"+","
                +getEmergency()+","+getConsult_id()+",\'"+getConsult_name()+"\'"+")");
    */
}
}
