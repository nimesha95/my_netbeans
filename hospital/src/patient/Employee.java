/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nimesha
 */
public class Employee extends Person {
    private int EmpID,SpecID;
    private String email,occupation;
    Employee(String Fname,String Lname,String Address,String NIC,int Phone,
        String email,String occupation){
        setFname(Fname);
        setLname(Lname);
        setAddress(Address);
        setNIC(NIC);
        setPhone(Phone);
        setEmail(email);
        setOccu(occupation);
    }
    
    void setSpecID(int num){
        this.SpecID=num;
    }
    void setEmpID(int num){
        this.EmpID=num;
    }
    void setEmail(String s){
        this.email = s;
    }
    void setOccu(String s){
        this.occupation=s;
    }
    
    int getSpecID(){
        return SpecID;
    }
    int getEmpID(){
        return EmpID;
    }
    String getEmail(){
        return email;
    }
    String getOccu(){
        return occupation;
    }
    
    void addToDB() throws Exception{    //push object to the database
        String sql = "INSERT INTO EMPLOYEE(FNAME,LNAME,NIC,PHONE,ADDRESS,EMAIL,OCCUPATION) VALUES"
                + "('"+getFname()+"','"+getLname()+"','"+getNIC()+"',"+getPhone()+",'"+getAddress()+"','"+getEmail()+"','"+getOccu()+"')";
        DBcon.post(sql);
    }
    
    void GetEmpID() throws Exception{   //sets empid variable by searching the database
        try {
            String sql = "SELECT ID FROM EMPLOYEE WHERE NIC='"+getNIC()+"'"; 
            ResultSet rs = DBcon.get(sql);
            while(rs.next()){
                setEmpID(rs.getInt("id"));    
            }
            rs.close();        
        }
        catch (SQLException | ClassNotFoundException ex) {  
            Logger.getLogger(DBcon.class.getName()).log(Level.SEVERE, null, ex);   
            }
    }
}
