package com.javaproblems;
import java.util.Scanner;
public class CountEvenOdd {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int even=0 , odd=0;
        for (int i=1;i<=num;i++){
            int count = sc.nextInt();
             if(count%2==0)
                 even++;
             else
                 odd++;
             }
         System.out.println("even number"+even);
             System.out.println("even number"+odd);
        }
    }




