package org.example.day3;
import java.util.Scanner;
public class count_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++){ //str.length() = eg"Hello" -> 0 1 2 3 4
                char ch = str.charAt(i); // Fetches the character at index i
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("The count of vowels is " + count);
    }
}
