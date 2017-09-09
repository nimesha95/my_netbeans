/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juststuff;

/**
 *
 * @author Nimesha
 */
public class hello {
    public static boolean mySubString(String one,String two){
        int len1=one.length();
        int len2=two.length();
        int match=0;
        for(int i=0;i<len1-len2;i++){
            if(one.charAt(i)==two.charAt(0)){
                for(int j=1;j<len2;j++){
                    if (!(two.charAt(j)==one.charAt(i+j))){
                        match=0;
                        break;
                    }
                    else{
                        match=1;
                    }
                }
                if(match==1){
                    return true;
                }
            }
        }
        return false;
    }
    int a[]={1,2,3};
    
    public static void one(int i){
        System.out.println("one");
 }
    public static void one(Integer i){
        System.out.println("two");
    }
    public static void main(String args[]){
        Integer c =new Integer(8);
        int x=c;
        one(x); //returns function with int as a parameter
        one(c); //returns function with Integer as a parameter             
    }
}
