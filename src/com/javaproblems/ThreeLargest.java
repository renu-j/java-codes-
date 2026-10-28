package com.javaproblems;

import java.util.Scanner;

public class ThreeLargest {
    static void main() {
        System.out.println("enter the three numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>= num3 && num1>=num3) {
            System.out.println("num1 is largest");
        }
            else if (num2>=num1 &&num2>=num3) {
                System.out.println("num2 is the largest ");
            }
            else {
            System.out.println("num3 is the largest ");

        }
    }
}


