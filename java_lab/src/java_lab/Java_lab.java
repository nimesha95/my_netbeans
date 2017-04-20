package java_lab;
import java.util.Scanner;

public class Java_lab {
    public static void main(String[] args) {
		/*
		1 2 3 4 5
		 2 4 6 8
		  3 6 9
		   4 8
		    5
		 */
                /*
		int count = 1;
		for (int i=5; i>0; i--) {
			for (int k=5; k>i; k--) {
				System.out.print(" "); //for the spaces of left
			}
			for (int j=1; j<=i; j++ ) {
				System.out.print((j*count)+" ");
			}
			System.out.println("");
			count++;
		}
*/
    hello hi = new hello(5,6,7,8);
    System.out.println(hi.four);
    
    }
    


}
