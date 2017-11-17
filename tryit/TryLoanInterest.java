package com.masterclass.tryit;

import java.math.BigDecimal;

public class TryLoanInterest {
    public static void main(String[] args)throws Exception {
        calculate(20.00,2500);
    }
    public static void calculate(double loan, double interest){
       BigDecimal total = BigDecimal.valueOf(loan).multiply(BigDecimal.valueOf(interest).divide(BigDecimal.valueOf(100)));
       //               = loan * (interest / 100)
        System.out.println(total);
        //System.out.println(BigDecimal.valueOf(loan).multiply(BigDecimal.valueOf(interest).divide(BigDecimal.valueOf(100))));
    }
}
