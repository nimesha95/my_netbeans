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
public class JustStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sqr(26);
        //first("abcdab");
        //System.out.println(fact(5));
        fibo(5);
    }
    
    public static void Sqr(int num){
        double lim = Math.sqrt(num);
        int to = (int) lim;
        //System.out.print(to);
        for(int i=1; i<= to ; i++){
            System.out.println(i*i);
        }
    }
    
    public static void first(String S){
        int StrLen = S.length();
        int[] alph = new int[26] ;
        for(int i=0; i<StrLen;i++){
            int inde = charToind(S.charAt(i));
            alph[inde] = alph[inde]+1;
        }
        
       for(int j=0; j<alph.length;j++){
           if(alph[j]==1){
               System.out.println(indToChar(j));
               break;
           }
       }
    }
    
    public static int charToind(char c){
        int ret = (int) c -97;
        return ret;
    }
    public static char indToChar(int x){
        char c = (char) (x+97);
        return c;
    }
    
    public static int fact(int x){
        if(x==1)
            return 1;
        else
            return (x*fact(x-1));
    }
    
    public static void fibo(int x){ 
        System.out.print("0 1 "); //printing n1 and n2
        fibo1(x-2,0,0,1);
    }
    public static void fibo1(int n,int n3,int n1,int n2){
        
        if(n>0){
            System.out.print(n3+" ");
            fibo1(n-1,n3=n1+n2,n1=n2,n2=n3);
        }
    }
    
}
