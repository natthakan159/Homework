package com.masterclass.methodoverloading;

public class MethodOverloading {
    public static void main(String[] args) {
       int newScore = calculateScore("Pete",500);
        System.out.println("New Score " + newScore);

        calculateScore(100);
        calculateScore();

    }
    public static int calculateScore(String playerName,int score){
        System.out.println("Player " + playerName + " score " + score + " point");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unname player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no score point");
        return 0;
    }
    // java calling from parameter for method
}
