package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        Scanner input=new Scanner (System. in);
        System.out.println("Enter name of 3 students ?");
        int i=0;
        while(i<=3)
        {
          name.add(input.next());
            i++;
        }
        System.out.println(name );

    }
}