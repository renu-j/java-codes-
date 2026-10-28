package com.javaproblems;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class SecondlargestSmallest {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements:");

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println("Second Smallest = " + arr[1]);
            System.out.println("Second Largest = " + arr[n - 2]);

            sc.close();
        }
    }




