package com.company;

class Task extends Thread{

    @Override
    public void run() {


            System.out.println("Thread Execute - "+Thread.currentThread().getName());

        }
}

public class MultithreadExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            Task t = new Task();
            t.start();


        }
    }
}
