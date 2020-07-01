/*
The program checks if a String is a palindrome or not.
 */

package com.company.alexandra.palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Please enter a String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        isPalindrome(string);
    }

    private static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("This string is not palindrome");
                return false;
            } else {
                i++;
                j--;
            }
        }
        System.out.println("This string is palindrome");
        return true;
    }
}
