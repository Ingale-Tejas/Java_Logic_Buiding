package org.example.day2;
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        a = 0
//        b= 1;
//        c = a + b
//        print c
//        a = b
//        b = c
            System.out.println("Enter Number: ");
            int n = sc.nextInt();

            int a = 0, b = 1;
        if (n >= 1) {
            System.out.print(a + " ");
        }

        // Handle second term
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Remaining terms
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}












