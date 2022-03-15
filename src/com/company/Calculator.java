package com.company;

import java.util.Scanner;

public class Calculator extends ParentCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input=new Scanner(System.in);
        int n1,n2;
        System.out.println("enter num1");
        n1=input.nextInt();
        System.out.println("enter num2");
        n2=input.nextInt();
        int addition =calc.AdditionOperation(n1,n2);
        int substraction = calc.substract(n1, n2);
        float division = calc.divisionOperation(n1, n2);
        int multiplication = calc.multiply(n1, n2);
        System.out.println(addition);
        System.out.println(substraction);
        System.out.println(division);
        System.out.println(multiplication);

    }
}
