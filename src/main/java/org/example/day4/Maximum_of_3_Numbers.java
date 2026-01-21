package org.example.day4;
import  java.util.Scanner;
public class Maximum_of_3_Numbers {

    static int max(int a, int b, int c){

        if (a>b && a>c){
            return a;
        }
        else if( b>a && b >c){
            return b;
        }
        else {
            System.out.println(c);
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 number's: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = max(a,b,c);

        System.out.println(result);
    }
}

// int largest = (a>b) ? (a >c ? a:c) : (b>c ? b:c); //for ternary operator!