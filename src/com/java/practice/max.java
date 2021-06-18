package com.java.practice;

import java.util.Scanner;

public class max {

    public static void main(String[] arg)
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First number");
        a=s.nextInt();
        System.out.println("Enter Second Number");
        b=s.nextInt();
        if (a>b)
        System.out.println("Max Number="+a);
        else
        System.out.println("Max Number="+b);
    }
}
