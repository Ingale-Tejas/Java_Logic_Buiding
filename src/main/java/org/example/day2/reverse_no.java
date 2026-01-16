package org.example.day2;
import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //Logic
//        num = 1234
//        rev = 0
//        digit = 1234 % 10 -> 4
//        rev = rev * 10 + digit -> 4
//        remove last digit
//        num = num / 10 -> 123

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;

        while(num!= 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
            System.out.print(rev);
        }
    }
