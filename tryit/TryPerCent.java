package com.masterclass.tryit;

import java.util.Scanner;

public class TryPerCent {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double loan;
        double percent;
        System.out.println("จำนวนเงินที่ท่านกู้ยืม : ");
        loan = sn.nextFloat();
        System.out.println("อัตราดอกเบี้ย ร้อยละ : ");
        percent = sn.nextFloat();
        calculatePercent(percent,loan);
    }
    public static void calculatePercent(double percent, double loan){

        double calcPercent = (10 * percent) / 1000;
        double interest = loan * calcPercent;
        System.out.println("ท่านต้องจ่ายดอกเบี้ยครั้งละ " + interest + " บาท / เดือน");
    }


}
