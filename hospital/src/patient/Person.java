
package patient;

/**
 *
 * @author Nimesha
 */
public class Person {   
    /*
    Parent class of the doctor and patient clases
    Contains the basic characteristics of a person object
    */
    private String Fname,Lname,Address,NIC;
    private int Phone;
    
    void setFname(String Fname){
            this.Fname=Fname;
    }
    void setLname(String Lname){
            this.Lname=Lname;
    }
    void setAddress(String Address){
        this.Address=Address;
    }
    void setNIC(String NIC){
        this.NIC=NIC;
    }
    void setPhone(int Phone){
        this.Phone=Phone;
        
    }
    

    int getPhone(){
        return Phone;
    }
    String getFname(){
        return Fname;
    }
    String getLname(){
        return Lname;
    }
    String getAddress(){
        return Address;
    }
    String getNIC(){
        return NIC;
    }
  
}
