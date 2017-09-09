/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

/**
 *
 * @author Nimesha
 */
public class testing {
    


public static boolean balh(String str,int inde){
    String cur=String.valueOf(str.charAt(inde));
    int blas=inde-1;
    while(true){
        blas++;
        System.out.println(str.charAt(blas));
        if(str.charAt(blas)=='.')
            continue;
        else if(buhaha(cur).equals(String.valueOf(str.charAt(blas)))){
            return true;
        }
        else
            return false;
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