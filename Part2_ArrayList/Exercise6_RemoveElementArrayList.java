package Assigment1;
import java.util.ArrayList;
import java.util.Scanner;

public class EX_6{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter how many numbers");
        int n = input.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter the numbers:");
        for(int i = 0;i<n;i++){
            int value = input.nextInt();
            list.add(value);
        }
        System.out.println("Enter the key of remove: ");
        int key = input.nextInt();
        
        for(int i = 0;i < list.size();i++){
            if (list.get(i) == key){
                list.remove(i);
                i--;
            }
        }
        System.out.println("Result: "+list);
        input.close();
    }
}