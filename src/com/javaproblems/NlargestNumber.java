package com.javaproblems;
import java.util.Scanner;
public class NlargestNumber {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of inputs: ");
                int n = sc.nextInt();

                System.out.print("Enter number 1: ");
                int largest = sc.nextInt();

                for (int i = 2; i <= n; i++) {
                    System.out.print("Enter number " + i + ": ");
                    int num = sc.nextInt();

                    if (num > largest) {
                        largest = num;
                    }
                }
                System.out.println("Largest number = " + largest);
            }
        }