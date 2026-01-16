package org.example.day2;
import java.util.Scanner;


public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number's: ");
        int n = sc.nextInt();
        int count = 0;

            if(n==0){
                count = 1;
            }
            else {

                while (n != 0) {
                    n = n / 10;
                    count++;
                }
            }
    System.out.println("Number of digits: " + count);
    }
    }

