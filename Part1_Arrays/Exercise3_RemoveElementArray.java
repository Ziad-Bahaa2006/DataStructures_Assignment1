
package Assigment1;

import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter number to remove: ");
        int key = s.nextInt();

        System.out.print("Output: [");
        boolean first = true;

        for (int x : arr) {
            if (x != key) {
                if (!first) System.out.print(", ");
                System.out.print(x);
                first = false;
            }
        }

        System.out.println("]");
    }
}
    
    
    
    

