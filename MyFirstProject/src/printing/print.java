/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

/**
 *
 * @author Nimesha
 */
public class print {
    public boolean isOn;
    public String ModelNo;
    
    public print(boolean isOn, String ModelNo){
        this.isOn=isOn;
        this.ModelNo=ModelNo;
    }
    
    public void Hell1(int copies){
        switch(copies)
        {
            case 0:
                break;
            case 1:
                if(isOn)
                {
                    System.out.println("if");
                }
                else
                {
                    System.out.println("else");
                
                }
            default:
            {
                System.out.println("Damn hello");
            
            }
        }
        //System.out.println(ModelNo);
    }
    
}
