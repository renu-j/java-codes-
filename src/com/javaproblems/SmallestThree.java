package com.javaproblems;
import java.util.Scanner;
public class SmallestThree {
    static void main() {
        System.out.println("enter any three number:");
                Scanner sc = new Scanner(System.in);
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                int num3 = sc.nextInt();

                if (num1 <= num2 && num1<= num3)
                    System.out.println(" smallest num1");
                else if (num2 <= num1 && num2 <= num3)
                    System.out.println("Smallest num2");
                else{
                    System.out.println("Smallest num3");
            }
        }
    }

