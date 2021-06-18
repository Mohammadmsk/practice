package com.java.practice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] arg)
    {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        a=s.nextInt();

        if (a%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
