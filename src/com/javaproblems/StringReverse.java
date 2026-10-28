package com.javaproblems;

public class StringReverse {
   public static void main(String[] args) {

            String str = "Java Programming";

            String reversed = new StringBuilder(str)
                    .reverse()
                    .toString();

            System.out.println(reversed);
        }
    }
