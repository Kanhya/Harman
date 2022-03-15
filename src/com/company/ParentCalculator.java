package com.company;

public class ParentCalculator {
    public int AdditionOperation(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public static int substract (int x, int y) {
        return  x - y;
    }
    public static int multiply(int x, int y) {
        return  x*y;
    }
    public static float divisionOperation(int x, int y) {


        if (y == 0){
            System.out.println("Cannot divide by 0");

            return  -1;
        }

        return  x / y;

    }
}
