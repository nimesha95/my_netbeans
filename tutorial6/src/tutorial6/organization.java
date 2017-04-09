
package tutorial6;

/**
 *
 * @author Nimesha
 */
public class organization {
    public static void main(String args[]){
        int members= Integer.parseInt(args[0]);
        int months=0;
        while(members%2==0){
            months +=1;
            members= members/2;
        }
        System.out.println("Initial member count --> "+members);
        System.out.println("Months since started -->" + months);
    }
}
