/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Nimesha
 */
public class pattern {
    public static void main(String args[]){
        char[] given1 ={ 'a', 'a','b','a','b','b','a','a','b' }; 
        char[] pattern1 ={'a','a','b'};
        int position=pattern_chk(given1,pattern1);
        if(position==-1)
            System.out.println("Pattern not found");
        
        else
            System.out.println("Pattern position is: "+position);
    }
    
    public static int pattern_chk(char[] given,char[] pattern){
       int i,k,pos,m,n;
        m= given.length;
        n= pattern.length;
        for(i=0;i<=(m-n);i++)
        {
           k=0;
           while((k<n) && (pattern[k] == given[i+k]))
              k++;
           if(k==n) 
     {         pos=i+1;
               return pos;
     } 
     
        }
        return -1; 
    }
}
