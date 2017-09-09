/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyparty;

public class Recursion {

static void sum(int[] arr, int i, int sum, int target, String s)
{   
    for(int j = i+1; j<arr.length; j++){
        if(sum+arr[j] == target){
            String x = s+" "+String.valueOf(arr[j]+" "+j);
            String[] strArray = x.split(" ");
            int[] intArray = new int[strArray.length+1];
            
            int index_of_first=getArrayIndex(arr,Integer.parseInt(strArray[0]));
            intArray[0] = Integer.parseInt(strArray[0]);    //searching the index of the first element
            intArray[1] = index_of_first;
            
            for(int p = 2; p < strArray.length+1; p++) {
                intArray[p] = Integer.parseInt(strArray[p-1]);
            }
            
            for(int a=0;a<intArray.length;a++){ //printing array
                System.out.print(intArray[a]+" ");
            }
            System.out.println(" ");
            
            
        }else{
            sum(arr, j, sum+arr[j], target, s+" "+String.valueOf(arr[j])+" "+j);
        }
    }
}

public static void chk(){
    
}

public static int getArrayIndex(int[] arr,int value) {  //this returns the index of the given element
    for(int i=0;i<arr.length;i++)
        if(arr[i]==value) return i;
    return -1;
}

public static void main(String[] args)
{   
    int[] numbers = {-2,1,1,4};
    for(int i =0; i<numbers.length; i++){
        sum(numbers, i, numbers[i], 5, String.valueOf(numbers[i])); 
    }

}
}