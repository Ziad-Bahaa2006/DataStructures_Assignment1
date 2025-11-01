
package Assigment1;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};

        int length = removeDuplicates(arr);

        System.out.print("Output: [ ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        
        return j + 1;
    }
}