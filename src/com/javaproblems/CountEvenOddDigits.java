package com.javaproblems;
import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        // Loop until all digits are processed
        while (num != 0) {

            // Extract last digit
            int digit = num % 10;

            // Check if digit is even or odd
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Remove last digit
            num /= 10;
        }

        System.out.println("Even Digits = " + evenCount);
        System.out.println("Odd Digits = " + oddCount);


    }
}