package com.java.practice;

import java.util.Scanner;

public class demo {
    public static void main(String[] arg){
        int lng,brd,area,peri;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Rectangle");
        lng=sc.nextInt();
        System.out.println("Enter Breadth of Rectangle");
        brd=sc.nextInt();
        area=lng*brd;
        peri=2*(lng+brd);
        System.out.println("Area of Rectangle="+area);
        System.out.println("Perimeter of Rectangle="+peri);
        }
}
