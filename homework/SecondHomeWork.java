package com.masterclass.homework;

public class SecondHomeWork {
    public static void main(String[] args) {

        int highScore = calculateScore(true,800,5,100);
        System.out.println("You final score was : " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Pete", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Kaew", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Arm", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Eye", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Mint",highScorePosition);
    }
    public static void displayHighScorePosition(String player,int highScorePosition ){
        System.out.println(player + " managed to get into position " +
                + highScorePosition +" on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore){

        if (playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500 && playerScore <= 1000){
            return 2;
        }else if(playerScore >= 100 && playerScore <= 500){
            return 3;
        }else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver,int score,int levelComplete,int bonus){

        if (gameOver){
            int finalScore = score + (levelComplete * bonus);
            return finalScore;
        }
        return -1;
    }
}
