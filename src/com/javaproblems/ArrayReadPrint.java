package com.javaproblems;
import java.util.Scanner;
public class ArrayReadPrint {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of inputs: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
               }
        }
    }

