package org.example.day1;
import  java.util.Scanner;
//Q7️ Simple Calculator (Core Logic)
//Two numbers
//One operator (+ - * /)
//Perform operation using if–else
//Input: 10 2 *
//Output: 20


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Operator(+, -, *, /): ");
        char op = sc.next().charAt(0);

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/')
            System.out.println(a / b);
        else {
            System.out.println("Invalid Operation");
        }

    }

}

