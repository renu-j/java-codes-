package com.javaproblems;
import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range: ");
        int start = sc.nextInt();

        System.out.print("Enter end range: ");
        int end = sc.nextInt();
        int count = 0;

        // Check every number in the range
        for (int num = start; num <= end; num++) {

            boolean isPrime = true;

            // Numbers less than 2 are not prime
            if (num < 2) {
                isPrime = false;
            }

            // Check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Increase count if prime
            if (isPrime) {
                count++;
            }
        }

        System.out.println("Count = " + count);

        sc.close();
    }
}