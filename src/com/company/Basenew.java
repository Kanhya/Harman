package com.company;

 class Basenew {

 void display (){
    System.out.println("Parent class");

}
}
class Child extends Base{
    @Override
    void display() {
        super.display();
    }

    @Deprecated
    void Calculate()
    {
        System.out.println("Calculator");
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.display();

        @SuppressWarnings({"deprcted", "unsaved"})
        int x;

        c.Calculate();
    }
}