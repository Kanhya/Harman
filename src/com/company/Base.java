package com.company;

 class Basenew {
 void display(){
     System.out.println("Parent class");

 }
}
class Child extends Basenew{
    @Override
    void display() {
        super.display();

    }

    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }
}