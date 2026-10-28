package com.javaproblems;
import java.util.Scanner;
public class PostiveNegative {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        if(num<0) {
            if (num == 0)
                System.out.println("The number is zero");
            else
                System.out.println("the number is positive");
        }else
               System.out.println("the number is negative");

        }

    }



