package org.asta;

/**
 * @author Asta
 */
public class Task1 {

//     Palindrome Number
//     Given an integer x, return true if x is a palindrome, and false otherwise.

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
