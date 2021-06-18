package com.java.practice;

import java.util.Scanner;

public class Tax {

    public static void main(String[] arg)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number");
        a=s.nextInt();
        System.out.println("Enter Second Number");
        b=s.nextInt();
        System.out.println("Enter Third Number");
        c=s.nextInt();

        if (a>b && a>c)
            System.out.println("Max Number="+a);
        else if (b>c && b>a)
            System.out.println("Max Number="+b);
        else
            System.out.println("Max Number"+c);
    }
}
