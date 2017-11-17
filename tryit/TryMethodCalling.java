package com.masterclass.tryit;
import java.util.Scanner;
public class TryMethodCalling {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int number;
        System.out.println("Do you have a number : ");
        number = sn.nextInt();
        checkNumber(number);
        float money = 2500f;
        float perCent = 20;
        float percent = (10 * perCent) / 1000;
        System.out.println(percent);


    }
    public static int checkNumber(int number){
        if(number <= 0 || number > 9){
            System.out.println("Please try again!");
            return numberAgain(number);
        }else {
            System.out.println("You have a number : " + number);
        }
        return nameClass(number);
    }

    public static int numberAgain(int number){
        Scanner sn = new Scanner(System.in);
        System.out.println("Do you have a number : ");
        number = sn.nextInt();
        return checkNumber(number);
    }
    public static int nameClass(int number){
        switch (number){
            case 1:
                System.out.println("Kaewyakorn Kaewkamsri");
                break;
            case 2:
                System.out.println("Pattamaporn Bunsupakun");
                break;
            default:
                System.out.println("Other name");
                break;
        }
        return gradeClass(number);
    }
    public static int gradeClass(int number){
        int preTest1;
        int testFinal;
        int totalTest;

        if (number == 1){
            preTest1 = 40;
            testFinal = 30;
            totalTest = preTest1 + testFinal;
                if (totalTest >= 80){
                    System.out.println("Get grade = A ");
                }else if (totalTest >= 75){
                    System.out.println("Get grade = B+ ");
                }else if (totalTest >= 70){
                    System.out.println("Get grade = B ");
                }else {
                    System.out.println("Kaewyakorn layoff");
                }
                return number;
        }
        return number;

    }
}