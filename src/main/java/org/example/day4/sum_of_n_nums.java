package org.example.day4;
import java.util.Scanner;

public class sum_of_n_nums {

    static int printAndSum(int n) {

        // base case
        if (n == 0) {
            return 0;
        }

        // recursive call
        int sum = printAndSum(n - 1);

        // print number
        System.out.print(n + " ");

        // return sum
        return sum + n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = printAndSum(n);

        System.out.println("\nSum = " + result);
    }
}
