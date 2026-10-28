package com.javaproblems;
import java.util.Scanner;
public class FibonaccisSeries {
    // Recursive method to find the nth Fibonacci number
        static int fibonacci(int n) {
            // Base case:
            // If n is 0 or 1, return n directly
            if (n <= 1)
                return n;

            // Recursive case:
            // Fibonacci number is the sum of the previous two numbers

            return fibonacci(n - 1) + fibonacci(n-2);
        }
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            // Loop from 0 to n-1
            // and print each Fibonacci number

            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

