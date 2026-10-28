package com.javaproblems;
import java.util.Scanner;
public class AverageSumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += sc.nextInt();
        }

        double average = (double) sum / num;
        System.out.println("Average IS  = " + average);

    }
}
