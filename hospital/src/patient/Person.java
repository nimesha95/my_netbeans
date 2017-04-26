
package patient;

/**
 *
 * @author Nimesha
 */
public class Person {
    private String Fname,Lname,Address,NIC;
    private int Phone;
    
    void setFname(String Fname){
        if (Fname.equals(""))
            this.Fname="NULL";
        else
            this.Fname=Fname;
    }
    void setLname(String Lname){
        if (Lname.equals(""))
            this.Lname="NULL";
        else
            this.Lname=Lname;
    }
    void setAddress(String Address){
        this.Address=Address;
    }
    void setNIC(String NIC){
        this.NIC=NIC;
    }
    void setPhone(int Phone){
        try{
        this.Phone=Phone;
        }
        catch(NumberFormatException e){
            this.Phone=0;
        }
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
