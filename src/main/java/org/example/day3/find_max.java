package org.example.day3;
import java.util.Scanner;
public class find_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The Array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
         int max = Integer.MIN_VALUE; // here max getting initialized (-2147483648)

            for (int i = 0; i<size; i++){
                if(a[i] > max){  //eg: 10 > -2147483648
                    max = a[i]; //update -2147483648 to 10
                }
            }
        System.out.println("\nThe maximum element is: " + max);
    }
}