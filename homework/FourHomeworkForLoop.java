package com.masterclass.homework;

public class FourHomeworkForLoop {
    public static void main(String[] args) {

        for (int i=0; i>1; i++){

        }
    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i=2; i<=n;i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
