package com.javaproblems;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

             if (temp == reverse)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");

            }
        }