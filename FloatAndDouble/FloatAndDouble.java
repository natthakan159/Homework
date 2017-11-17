package com.masterclass.FloatAndDouble;

public class FloatAndDouble {
    // width of int = 32 (4 bytes)
    int myInt = 5;
    // width of float = 32 (4 bytes)
    float myFloat = 5f / 2f;
    //width of double = 64 (8 bytes)
    // if you use sin, cos formula you use data type = double
    double myDouble = 5d / 2d;

    public static void main(String[] args) {
        double pounds = 200d;
        double kilograms = 0.45359237d;

        double totalConvert = pounds * kilograms;

        System.out.println(totalConvert);
    }


}
