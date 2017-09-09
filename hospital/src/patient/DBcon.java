package patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBcon {
    private static String driver = "org.h2.Driver";
    private static String url = "jdbc:h2:C:\\Users\\amarasena\\Documents\\NetBeansProjects\\hospital\\db/patient;AUTO_SERVER=TRUE";
    private static String username = "test";
    private static String password = "test";
    
    public static void post(String var1) throws Exception   //executes the sql query
    {
        try{
            Connection con = getConnection();
            Statement st = con.createStatement();
            st.execute(var1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid values","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        finally {
            System.out.println("Insert Completed");
        }
    }
    
    public static ResultSet get(String sql) throws Exception{   //execute sql quary and returns resultset object
        try {
            Connection conn = getConnection(); 
            Statement st = conn.createStatement();
            try {
                ResultSet rs = st.executeQuery(sql);
                return rs;
            }
            catch(Exception e){}
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBcon.class.getName()).log(Level.SEVERE, null, ex);
    }
        return null;
    }
    
    public static Connection getConnection() throws Exception{  //establish connection
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password); 
            return conn;
        } catch(ClassNotFoundException | SQLException e){System.out.println(e);}
        
        return null;
    }
}

