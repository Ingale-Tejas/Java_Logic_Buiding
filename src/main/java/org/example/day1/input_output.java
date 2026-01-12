package org.example.day1;
import java.util.Scanner;
public class input_output {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter name");
        String name = a.nextLine();
        System.out.println("Enter age");
        int age = a.nextInt();

        System.out.println( "Hello "+ name + ", you are " + age + " Years old!"  );
    }
}


