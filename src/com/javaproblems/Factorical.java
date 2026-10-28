package com.javaproblems;
import java.util.Scanner;

public class Factorical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextInt();
        long factorial = 1;
        // Multiply factorial by each number from 1 to num
        for (long i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial = " + factorial);

    }
}