package com.javaproblems;
import java.util.Scanner;
public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Assume number is prime
        boolean prime = true;

        // Numbers less than 2 are not prime
        if (n < 2) {
            prime = false;
        }
        // Check divisibility
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}