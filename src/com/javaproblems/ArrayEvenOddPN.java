package com.javaproblems;

import java.util.Scanner;

public class ArrayEvenOddPN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {-5, 0, 7, 4, -2, 8};

        int even = 0, odd = 0, positive = 0, negative = 0, zero = 0;

        for(int num : arr) {

            if(num % 2 == 0)
                even++;
            else
                odd++;

            if(num > 0)
                positive++;
            else if(num < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);

        sc.close();
    }
}