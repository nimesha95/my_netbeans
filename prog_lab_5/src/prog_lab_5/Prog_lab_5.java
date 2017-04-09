package prog_lab_5;
import java.util.Scanner;
public class Prog_lab_5 {
    static int input_rec;   //used for recursive factorial
    static int fact_recu=1; //used for recursive factorial

    public static void main(String[] args) {
        //palindrom();
        //fact_ite();
        //fact_recu();
        //int[] arry={1,3,2,9,8,4,6};
        //bubble_sort(arry);
        //calender.run_cale();
        calender.dashes();
        calender.week_txt();
    }

    public static void palindrom(){
        int chk=0; 
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input1=scn.nextLine();
        input1=input1.toUpperCase();
        int input_len = input1.length();
        double len_revised = Math.ceil(input_len/2f);
        for(int i=0;i<=len_revised;i++){
            char front=input1.charAt(i);
            char back=input1.charAt(input_len-1-i);
            if(front != back){
                System.out.println("Not a palindrom");
                chk=1;
                break;
            }
        }
        if(chk==0)
            System.out.println("Is a palindrom");
    }

    public static void fact_ite(){
    int fact=1;
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int inpt= scn.nextInt();
    for(int i=1;i<=inpt;i++){
        fact=fact*i;
    }
    System.out.println("Factorial "+inpt+" is: "+fact);    
}

    public static void fact_recu1(int n){
    if(n==0)
        System.out.println("Factorial "+input_rec+" is: "+fact_recu);
    else{
        fact_recu=fact_recu*n;
        fact_recu1(n-1);
    }   
}

    public static void fact_recu(){
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter a number: ");
    input_rec= scn.nextInt();
    //System.out.println("-- "+input_rec);
    fact_recu1(input_rec);   
}
    
    public static void bubble_sort(int arr[]){
        int arry_len=arr.length;
        int temp;
        for(int i=0;i<arry_len;i++){
            for(int j=0;j<arry_len;j++){
                if(j==arry_len-1)
                    break;
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
            }
            }
        }
        for(int i=0;i<arry_len;i++){
            System.out.println(arr[i]);
        }
    }
}
