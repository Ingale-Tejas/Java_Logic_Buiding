package org.example.day4;
import java.util.Scanner;
public class add_to_num {

    static int sum(int a, int b){
        int add = a + b;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 number's: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a,b);

        System.out.println("Sum = " + result);

    }
}
