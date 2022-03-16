package com.company;

abstract class PetrolPrice {
    abstract void changePrice();

}



class Govt extends PetrolPrice{
    void changePrice()
    {
        System.out.println("Increased by 2%");

    }

    public static void main(String[] args) {

        PetrolPrice price=new Govt();
        price.changePrice();
    }
}