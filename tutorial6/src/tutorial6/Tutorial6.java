package tutorial6;

import java.util.Scanner;

public class Tutorial6 {

    public static void main(String[] args) {
        run_crime();
    }
    
    public static void run_crime(){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the date of the current month: ");
        int date=scn.nextInt();
        find_crime(date);
    }
    
    public static void find_crime(int day){
        if (prime(day))
            System.out.println("There will be a crime");
        else
            System.out.println("There won't be a crime");
    }
    
    public static boolean prime(int no){
        for(int i = 2; i < (int) Math.sqrt(no) + 1 ; i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
}
