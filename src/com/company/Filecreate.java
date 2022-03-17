package com.company;

import java. io. FileNotFoundException;
import java. io. FileOutputStream;
import java.io.IOException;
public class Filecreate {
public static void main(String[]args){
        String data="welcome to Java Programming";
        try{
            FileOutputStream file = new FileOutputStream("Sample.txt");
            byte b[]=data.getBytes();
         file.write(b);
            file.close();
         System.out.println("file created successfully");
        }
        catch (FileNotFoundException e){

            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
        }
        }