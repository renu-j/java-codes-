package com.javaproblems;

public class StrPalindrome {
    public static void main(String[] args) {

        String str = "madam";

        boolean isPalindrome = str.equals(
                new StringBuilder(str)
                        .reverse()
                        .toString()
        );

        System.out.println(isPalindrome);
    }
}