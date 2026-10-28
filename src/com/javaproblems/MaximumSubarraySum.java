package com.javaproblems;
import java.util.Scanner;
public class MaximumSubarraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            currentSum += arr[i];

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = "
                + maxSum);
    }
}