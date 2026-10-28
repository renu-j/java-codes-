package com.javaproblems;
import java.util.Scanner;
public class ArratCopyCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }

        boolean equal = true;

        for (int i = 0; i < n; i++) {

            if (arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }

        if (equal)
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are Not Equal");
    }
}