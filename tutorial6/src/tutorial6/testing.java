/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;

/**
 *
 * @author Nimesha
 */
public class testing {
    public static void main(String args[]){
        String[] arr={"A","B","C","D","E"};
        int[] values = {2,4,8}; //second position means 1st index---- first position means 0th index
        for(int i=0;i<values.length;i++){
            int index = values[i]-1;
            if(index < arr.length)
                arr[index] = null;
                      //in java list size cannot be changed, that's why we assign a "null"
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
