package com.masterclass.method;

public class Methods {
    public static void main(String[] args) {

        int highScore = calculateScore(true,800,5,100);
        System.out.println("You final score was : " + highScore);

        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bonus = 200;

        highScore = calculateScore(gameOver,score,levelComplete,bonus);
        System.out.println("You final score was : " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if(gameOver){
            int finalScore = score + (levelComplete *  bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
