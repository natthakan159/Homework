package com.masterclass;

public class preTest {
    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 200;
        int myInteger = 100;
        long myLong = 50000L + 10L *(myByte + myShort + myInteger);
        long intTotal =  (1000 + 10 * (myByte + myShort + myInteger + myLong));
        System.out.println(intTotal);
        System.out.println(myLong);

    }
}
