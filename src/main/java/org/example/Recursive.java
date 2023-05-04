package org.example;

public class Recursive {
    public static void printIncreasingNumber (int n) {
        if(n > 0) {
            printIncreasingNumber(n - 1); // 1 2 3 4 5
            System.out.println(n);
        }
    }
    public static void printDecreasingNumber (int n) {
        if(n > 0) {
            System.out.println(n);
            printDecreasingNumber(n -1);
        }
    }
    public static int sumOfaRun(int n) {
        if(n < 0) {
            return 0;
        }
        return sumOfaRun(n -1 ) + n;
    }
}