package com.company;

class Task1 extends Thread {


    @Override
    public void run() {
        System.out.println("Task 1 Thread Executed - "+ Thread.currentThread().getName());

    }
}
class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Task 2 Thread Executed -"+Thread.currentThread().getName());
    }

}
class  Task3 extends Thread{
    @Override
    public void run(){
        System.out.println("Task 3 Thread Executed -"+ Thread.currentThread().getName());
    }
}
 class Multiple {
    public static void main(String[] args) {

        Task1 t1 =new Task1();
        t1.start();

        Task2 t2 =new Task2();
        t2.start();

        Task3 t3 =new Task3();
        t3.start();
    }
}
