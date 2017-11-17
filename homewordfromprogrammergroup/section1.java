package com.masterclass.homewordfromprogrammergroup;

import java.util.Scanner;

public class section1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int number1= sn.nextInt();
        System.out.println("Enter Number 2 : ");
        int number2 = sn.nextInt();
        System.out.println("Enter Char : ");
        char character = sn.next().charAt(0);
        switch (character){
            case 'a':
                System.out.println(number1 + number2);
                break;
            case 'b':
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Error");
        }
    }
}
