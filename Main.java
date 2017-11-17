package com.masterclass;

public class Main {

    public static void main(String[] args) {

    // int has a width of 32
	// 2 to power of 31 = 214748368
	int myMinValue = -214748366;
	int myMaxValue = 2147483647;
	int myTotal = (myMinValue/2);
		System.out.println("myTotal : " + myTotal);

	// byte has a width of 8
	// 2 to power of 7 = 128
	byte byteMinValue = -128;
	byte byteMaxValue = 127;
	byte byteTotal = (byte) (byteMinValue/2);

		System.out.println("byteTotal : " + byteTotal);

	// short has a width of 16
	short shortMinValue = -32768;
	short shortMaxValue = 32767;
	short myShort = (short) (shortMinValue/2);
		System.out.println("myShort : " + myShort);

	// long has a width of 64
	// 2 to power of 63 = 9,223,372,036,854,775,807
	long myLongValue = 9_223_372_036_854_775_807L;
	long myLongTotal = (myLongValue/2);
	long myLongPlusInt =(myLongValue);
		System.out.println(myLongTotal);
		System.out.println(myLongPlusInt);
	double myLongDecimal = (myLongValue);
		System.out.println(myLongDecimal + myLongTotal);

    }
}
