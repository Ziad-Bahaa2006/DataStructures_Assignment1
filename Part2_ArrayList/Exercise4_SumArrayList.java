package Assigment1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        int total = 0;
        for (int num : list) {
            total += num;
        }

        System.out.println("Sum = " + total);
    }
}
