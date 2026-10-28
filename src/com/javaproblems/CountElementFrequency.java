package com.javaproblems;
import java.util.Scanner;
public class CountElementFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {

            int count = 1;
            boolean visited = false;

            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if(visited)
                continue;

            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}
