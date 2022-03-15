package com.company;

import java.util.Scanner;

public class Main {
    public int AdditionOperation(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        Main cal = new Main();
        Scanner input=new Scanner(System.in);
        int n1,n2,result;
        System.out.println("enter num1");
        n1=input.nextInt();
        System.out.println("enter num2");
        n2=input.nextInt();
        result=cal.AdditionOperation(n1,n2);
        System.out.println(result);
    }
}