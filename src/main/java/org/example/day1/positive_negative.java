package org.example.day1;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // Basic Code for Positive , Negative Integers
//        System.out.println("Enter Number: ");
//        int num = sc.nextInt();
//
//        if (num >= 0) {
//                System.out.println("Positive Number");
//            } else {
//                System.out.println("Negative Number");
//            }
//        }

        while(true){
            System.out.println("Enter number: or type Exit to exit program: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")){ // .equals -> (compare actual text) Ignorecase-> (Exit, exit, ExIt all same)
                System.out.println("Program Exited . . .");
                break;
            }
            int num = Integer.parseInt(input); // converts String to Integer
            if(num>=0){
                    System.out.println("Positive number");
            }
            else{
                System.out.println("Negative number");
            }
        }
    }
    }

