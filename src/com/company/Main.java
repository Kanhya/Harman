package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Addition add = new Addition();
        Substraction sub = new Substraction();
        Multiplication mul = new Multiplication();
        divisibility div = new divisibility();

        Scanner input=new Scanner(System.in);
        int n1,n2,result;
        System.out.println("enter num1");
        n1=input.nextInt();
        System.out.println("enter num2");
        n2=input.nextInt();
        int addition =add.AdditionOperation(n1,n2);
        int substraction = sub.substract(n1, n2);
        float division = div.divisionOperation(n1, n2);
        int multiplication = mul.multiply(n1, n2);
        System.out.println(addition);
        System.out.println(substraction);
        System.out.println(division);
        System.out.println(multiplication);
    }
}