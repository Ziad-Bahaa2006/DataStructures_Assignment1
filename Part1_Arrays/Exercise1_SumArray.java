package Assigment1;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int total = 0;
        for (int value : arr) {
            total += value;
        }

        System.out.println("Sum = " + total);
    }
}
