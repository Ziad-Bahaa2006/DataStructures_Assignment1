
package Assigment1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class EX5 {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      System.out.print("ENTER number of elements: ");
      int n = input.nextInt();
      int [] arr = new int [n];
      
      System.out.print("Enter " + n + "sorted Elements: ");
      for (int i = 0 ; i<n ; i++){
      arr [i]= input.nextInt();
        }  
      ArrayList<Integer> uniqueList = new ArrayList<>();
   
       if(n>0){
        uniqueList.add(arr[0]);
   }
 
         for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueList.add(arr[i]);
            }
        }
        
      System.out.println("Input: " + Arrays.toString(arr));
      System.out.println("Output: " + uniqueList);
    }
}
    
    
