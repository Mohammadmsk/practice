package com.java.practice;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String []arg)
    {
        int a,b,ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number");
        a=s.nextInt();
        System.out.println("Enter Second Number");
        b=s.nextInt();
        System.out.println("Enter your choice 1 -> Add 2-> Subtract 3-> Multiple 4-> Division \nEnter your Choice");

        ch=s.nextInt();

        if (ch==1)
            System.out.println("Addition="+(a+b));
        else if (ch==2)
            System.out.println("Subtraction="+(a-b));
        else if (ch==3)
            System.out.println("Multiplication="+(a*b));
        else if (ch==4)
            System.out.println("Division="+(a/b));
        else
            System.out.println("Invalid Selection");
    }
}
