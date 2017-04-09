package prog_lab_5;
import java.util.Scanner;
public class calender {
    
    public static void run_cale(){
        int year;
        String month,first_day;
        Scanner scn= new Scanner(System.in);
        System.out.print("Year: ");
        year =scn.nextInt();
        System.out.print("Month: ");
        month = scn.next();
        System.out.print("1st day of month: ");
        first_day = scn.next();
    }
    
    public static void dashes(){
        for(int i=0;i<30;i++)
            System.out.print("-");
        System.out.println(" ");
    }
    
    public static void week_txt(){
        System.out.println("SUN MON TUE WED THU FRI SAT");
    }
}
