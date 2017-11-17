package com.masterclass.forloop;

import java.math.BigDecimal;

public class ForLoop {
    public static void main(String[] args) {
        //for(init; termination; increment)
            // BigDecimal
//        BigDecimal bd1 = new BigDecimal(1);
//        BigDecimal bd2 = new BigDecimal(2);
//        BigDecimal bd = bd1.multiply(bd2);
//        System.out.println(bd);
        for(int i=2; i<9; i++){
            String[] sharp = {"A","B","C","D"};
//          System.out.println("Use BigDecimal 10000  at " + i + " % interest = " + calculateInterest((double) 10000, (double) i));
            System.out.println("Use Double 10000 at " + i + " % interest = " + String.format("%.2f", calculateInterestRate((double)10000, (double) i)));
            // String.format("%.2f") = 0.00
        }
        System.out.println("#####################");

        for(int j=8; j>1; j--){
            System.out.println("10000 at " + j + " % interest = " + String.format("%.2f",calculateInterestRate((double)10000 , (double)j)));
        }

        for (int p=1; p<10; p++){
            if (isPrime(p)){
                System.out.println("AND " + p);
                if (p == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if (n % i == 0){ // การหารลงตัว
                return false;
            }
        }
        return true;
    }

    public static double calculateInterestRate(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static BigDecimal calculateInterest(double amount, double interestRate){
      return BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(interestRate).divide(BigDecimal.valueOf(100)));
    }


}
