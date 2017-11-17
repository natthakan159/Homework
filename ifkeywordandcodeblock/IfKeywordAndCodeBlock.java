package com.masterclass.ifkeywordandcodeblock;

public class IfKeywordAndCodeBlock {
    public static void main(String[] args) {


//        if(score < 5000 && score > 1000){
//            System.out.println("You score was less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("You score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        calculateScore();

        boolean gameOver2 = true;
        int score2 = 10000;
        int levelComplete2 = 8;
        int bonus2 = 200;

        if (gameOver2) {
            int finalScore = score2 + (levelComplete2 * bonus2);
            System.out.println("You final score was : " + finalScore);
        }
    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        if(gameOver == true){
            int finalScore = score + (levelComplete * bonus);
            System.out.println("You Final Score was : " + finalScore);
        }
    }
}
