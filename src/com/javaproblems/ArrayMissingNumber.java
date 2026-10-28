package com.javaproblems;
import java.util.Scanner;
public class ArrayMissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        int actualSum = 0;

        System.out.println("Enter elements:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        int n = size + 1;

        int expectedSum = n * (n + 1) / 2;

        System.out.println("Missing Number = "
                + (expectedSum - actualSum));
    }
}