package com.masterclass.homework;

public class ThirdHomeWorkFromMethodOverloading {
    public static void main(String[] args) {

        double centimeter = calcFeetAndInchesToCentimeters(0,0);
        if(centimeter < 0.0){
            System.out.println("Invalid parameter");
        }
        calcFeetAndInchesToCentimeters(157);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || (inches < 0) || (inches >12)){
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0 ){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainder = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainder + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainder);
    }

}
