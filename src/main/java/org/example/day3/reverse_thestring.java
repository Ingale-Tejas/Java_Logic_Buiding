package org.example.day3;
import  java.util.Scanner;
public class reverse_thestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Reversed string: ");

        for (int i = str.length() - 1 ; i >=0 ; i-- ){
         System.out.print(str.charAt(i));
        }
    }
}
