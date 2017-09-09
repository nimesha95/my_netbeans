/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nimesha
 */
public class Codechef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i=0;i<times;i++){
            String status="Valid";
            int str_len = sc.nextInt();
            String str = sc.next();
            Stack<String> stack=new Stack<String>();
            for(int x=0;x<str_len;x++){
                if(str.charAt(x)=='.'){
                    continue;
                }
                else{
                    stack.push(String.valueOf(str.charAt(x)));
                }
            }
            
            if(stack.size()%2==1){
                System.out.println("Invalid");
                break;
            }
            String one,two,temp;
            String res="Valid";
            while (!stack.isEmpty()){
                one=stack.pop();
                two=stack.pop();
                temp=buhaha(two);
                if(one.equals("H")){
                    res="Invalid";
                    break;
                }
                if(one.equals(temp)){
                    res="Valid";
                }
                
                
                else{
                    res="Invalid";
                    break;
                }               
            }
            
            System.out.println(res);
        }
    }
    
  public static String buhaha(String x){
        if(x.equals("H")){
            return "T";
        }
        else if(x.equals("T")){
            return "H"; 
        }
        return "";
    }  
}
