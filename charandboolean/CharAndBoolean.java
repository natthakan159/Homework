package com.masterclass.charandboolean;

public class CharAndBoolean {
    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00AE';
        System.out.println(myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not aLien!!");
        }
        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score!");

        }
        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than top score and less then 100");

        }
        if((topScore > 90) || ((secondTopScore <= 90))) {
            System.out.println("One if these test is true");
        }
        int newnValue = 50;
        if(newnValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen" + isCar);
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }


    }
}
