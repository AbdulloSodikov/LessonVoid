package com.company;

public class Main {

    public static void main(String[] args) {
        int maxNum = max(15, 20);    // Задача № 2
        int totalNumAB = totalNum(1, 6);   // Задача № 3
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static int totalNum(int a, int b) {
        int counter = 0;
        for (int i = a; i <= b; i++) {
            counter = counter + i * i;
        }
        return counter;
    }
}
