package patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nimesha
 */
public class Patient extends Person{
    private int Age,Emergency, consult_id;
    private String email,guard_name, consult_name,dob,sex;
    
    Patient(){} //default constructor
    
    Patient(String Fname,String Lname,String Address,String NIC,int Phone,
        int Age,String guard_name,int Emergency,int consult_id,String email,
        String consult_name,String dob,String sex){
        setFname(Fname);
        setLname(Lname);
        setAddress(Address);
        setNIC(NIC);
        setPhone(Phone);
        setAge(Age);
        SetDOB(dob);
        SetGuard(guard_name);
        setEmergency(Emergency);
        setConst_id(consult_id);
        setEmail(email);
        setConst_name(consult_name);
        setSex(sex);
    }
    
    //getters
    void setSex(String sex){
        this.sex=sex;
    }
    
    void setAge(int Age){
        this.Age=Age;
    }
    void SetDOB(String dob){
        this.dob=dob;
    }
    void SetGuard(String name ){
        this.guard_name=name;
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
    
 //setters   
    int getAge(){
        return Age;
    }
    String getSex(){
        return sex;
    }
    String getDOB(){
        return dob;
    }    
    String getGuard(){
        return guard_name;
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
    
    
    void pushToDB() throws ClassNotFoundException, SQLException, Exception{ //this method push the patient object to the database
        
        String sql="INSERT INTO patients(FNAME,LNAME,NIC,PHONE,ADDRESS,EMAIL,"
                + "EMERGENCY_C,CONTS_ID,CONST_NAME,guard_name,dob,age,sex) values ("
                +"\'"+getFname()+"\'"+",\'"+getLname()+"\'"+",\'"+getNIC()+"\'"+","+getPhone()+",\'"+getAddress()+"\'"+",\'"+getEmail()+"\'"+","
                +getEmergency()+","+getConsult_id()+",\'"+getConsult_name()+"\','"+getGuard()+"','"+getDOB()+"',"+getAge()+",'"+getSex()+"')";
        DBcon.post(sql);
        System.out.println("Database updated");       
}

    void GetFromDB(int pid) throws Exception{   //this populates a patient object by getting data from database
        try {
            String sql = "SELECT * FROM PATIENTS WHERE ID="+pid;
            ResultSet rs = DBcon.get(sql);
                while(rs.next()){
                    setFname(rs.getString("FNAME"));
                    setLname(rs.getString("LNAME"));
                    setNIC(rs.getString("NIC"));
                    setPhone(rs.getInt("PHONE"));
                    setAddress(rs.getString("ADDRESS"));
                    setEmail(rs.getString("EMAIL"));
                    setEmergency(rs.getInt("EMERGENCY_C"));
                    setConst_id(rs.getInt("CONTS_ID"));
                    setConst_name(rs.getString("CONST_NAME"));
                    SetGuard(rs.getString("GUARD_NAME"));
                    SetDOB(rs.getString("DOB"));
                    setAge(rs.getInt("AGE"));
                }
                rs.close();
            System.out.println("Done");
        }
        catch (SQLException | ClassNotFoundException ex) {  
            Logger.getLogger(DBcon.class.getName()).log(Level.SEVERE, null, ex);   
            }
}
}