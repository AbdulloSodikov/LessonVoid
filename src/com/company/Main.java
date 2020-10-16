package com.company;

public class Main {

    public static void main(String[] args) {
        int maxNum = max(15, 20);    // Задача № 2
        int totalNumAB = totalNum(1, 6);   // Задача № 3

        int[] array = {10, 2, 3, 4, 5, 60, 7, 8, 9};  // Задача № 4
        int maxNumberInArray = maxInArray(array);

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
    public static int maxInArray(int[] array) {
        int counterMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (counterMax < array[i]) {
                counterMax = array[i];
            }
        }
        return counterMax;
    }
}
