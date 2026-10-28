package com.javaproblems;
    import java.util.Scanner;

    public class EvenOdd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println("The Number is Even ");
                else
                    System.out.println(" The number is Odd number");
            } else {
                System.out.println("Not Positive");
            }
        }
    }

