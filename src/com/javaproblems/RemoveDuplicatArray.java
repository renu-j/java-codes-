package com.javaproblems;
import java.util.HashSet;
import java.util.Scanner;


public class RemoveDuplicatArray {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size: ");
            int n = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            System.out.println("Enter elements:");

            for(int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            System.out.println(set);
        }
    }
