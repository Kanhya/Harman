package com.company;

class Task extends Thread{

    @Override
    public void run() {


            System.out.println("Thread Execute - "+Thread.currentThread());

        }
}

public class MultithreadExample {
    public static void main(String[] args) {

        Task t =new Task();
        t.start();

        Task t1=new Task();
        t1.start();

        Task t2=new Task();
        t2.start();

    }
}
