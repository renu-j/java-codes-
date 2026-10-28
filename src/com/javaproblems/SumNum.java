package com.javaproblems;
import java.util.Scanner;
public class SumNum {
     public static void main(String[] args) {;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i=1;i<=num;i++){
            sum+=i;
        }
System.out.println("the sum of the numbers is :" +sum);
    }
}
