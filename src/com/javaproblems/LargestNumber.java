package com.javaproblems;
import java.util.Scanner;
public class LargestNumber {
    static void main() {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("the number is largest");
        } else if (num1 < num2) {
            System.out.println("the number is largest");

        }else{
            System.out.println("the number are equal");
        }

    }
}