package com.javaproblems;
import java.util.Scanner;
public class RangePrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int start = sc.nextInt();

        System.out.print("Enter end range: ");
        int end = sc.nextInt();

        // Check every number in the range
        for (int num = start; num <= end; num++) {

            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            }

            // Prime checking
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}