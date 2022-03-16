package com.company;

public interface RBI {
     void setIntrestRate();

}
class SBI implements RBI{
    public void setIntrestRate() {
        System.out.println("7% Intrest");
    }

}
class ICICI implements RBI{

    public void setIntrestRate() {
        System.out.println("7.5% Intrest");

    }
}
class person {
    public static void main(String[] args) {
        RBI ob_Sbi=new SBI();
        RBI ob_Icici=new ICICI();
        System.out.println("SBI Bank=> ");
       ob_Sbi.setIntrestRate();
        System.out.println("ICICI Bank=> ");
        ob_Sbi.setIntrestRate();
    }
}