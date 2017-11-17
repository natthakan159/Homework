package com.masterclass.homework;

public class FirstHomeWork {
    public static void main(String[] args) {
        double oneDouble = 20;
        double twoDouble = 80;
        double total = (oneDouble + twoDouble) * 25;
        System.out.println(total);

        double remainder = total %40;
        System.out.println(remainder);
        if(remainder <= 20) {
            System.out.println("Total was the over limit");
        }
    }
}
