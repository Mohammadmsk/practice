package com.java.practice;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        int a, b, c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        c=a+b;
        f=a*b;
        System.out.println("Addition="+c);
        System.out.println("Multiplication="+f);
    }

}