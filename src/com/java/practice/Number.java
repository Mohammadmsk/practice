package com.java.practice;

import java.util.Scanner;

public class Number {
    public static void main(String []arg)
    {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        a=s.nextInt();

        if (a>0)
            System.out.println("Number is Positive");
        else if (a<0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
    }
}
