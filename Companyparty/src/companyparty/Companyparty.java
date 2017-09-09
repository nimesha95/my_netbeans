package companyparty;

/**
 *
 * @author LegendaryHippo
 */
public class Companyparty {

    public static void main(String[] args) {
        testcase1();
        testcase2();
        testcase3();
    }
    
    
   public static void ReturnGuestList(int n,int[] conviviality,int[][] sublst){
       int[] D=new int[n+1];
       int[] Dex=new int[n+1];
       
       
       int[] D_invitee=new int[n+1];
       for(int z=0;z<n+1;z++){  //assign -1 to invitee array
           D_invitee[z]=-1;
       }
       
       for(int i=n;i>0;i--){
           int sum_of_childeren=0;
           int sum_of_childeren_excluded=0;
           
           for(int x=0;x<2;x++){ //hardcoded cuz ther's only two children
                   int blah = sublst[i-1][x];   //indexes start from 0
                   //System.out.println(blah);
                   if (blah>0){
                   sum_of_childeren_excluded += Dex[blah];
                   sum_of_childeren += D[blah];
                   }
                }
           
           Dex[i]=sum_of_childeren;
           D[i]=Math.max(sum_of_childeren_excluded+conviviality[i-1],sum_of_childeren);
           if(sum_of_childeren_excluded+conviviality[i-1]>sum_of_childeren){
               D_invitee[i]=i;
           }
       }
       System.out.println("Total Maximum Conviviality is: "+D[1]);
       System.out.println("-----------Invitee List-----------");
       for(int x=0;x<n+1;x++){
           int val=D_invitee[x];
           if(val>-1){
            System.out.print(val+" ");
           }
       }
       System.out.println(" ");
     
       
   }
    
   public static void testcase1(){
       int n=4;        //number of nodes
       int[] convi={-2,1,6,3}; //conviviality list
       int[][] sublst= {{2,3},{4,-1},{-1,-1},{-1,-1}};     //This is the pointers, -1 is null pointer
       ReturnGuestList(n,convi,sublst);
   }
   
   public static void testcase2(){
       int n=4;        //number of nodes
       int[] convi={-2,1,1,4}; //conviviality list
       int[][] sublst= {{2,3},{4,-1},{-1,-1},{-1,-1}};     //This is the pointers, -1 is null pointer
       ReturnGuestList(n,convi,sublst);
   }
   
    public static void testcase3(){
       int n=5;        //number of nodes
       int[] convi={-2,1,6,3,4}; //conviviality list
       int[][] sublst= {{2,3},{4,-1},{5,-1},{-1,-1},{-1,-1}};     //This is the pointers, -1 is null pointer
       ReturnGuestList(n,convi,sublst);
   }
}
