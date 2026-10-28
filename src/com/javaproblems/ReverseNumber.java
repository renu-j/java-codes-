package com.javaproblems;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        long num = sc.nextLong();
        long reverse = 0;

        while (num != 0) {
            long digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println(reverse);

    }
}