package com.company;

abstract class CollegeFee {
    abstract void setAcadamicFee();

}
class Electrical_Dept extends CollegeFee{

    void setAcadamicFee(){
        System.out.println("10000");
    }

}
class ME_Dept extends CollegeFee{

    void setAcadamicFee(){
        System.out.println("75000");

    }
}
class CollegeOffice {
    public static void main(String[] args) {
        CollegeFee ab_Electrical=new Electrical_Dept();
        CollegeFee ab_ME=new ME_Dept();
        System.out.println("Electrical Dept Fee Structure");
        ab_Electrical.setAcadamicFee();
        System.out.println("ME Dept Fee Structure");
        ab_ME.setAcadamicFee();
    }
}