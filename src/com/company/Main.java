package com.company;

public class Main {

    public static void main(String[] args) {
        int maxNum = max(15, 20);    // Задача № 2
        int totalNumAB = totalNum(1, 6);   // Задача № 3

        int[] array = {10, 2, 3, 4, 5, 60, 7, 8, 9};  // Задача № 4
        int maxNumberInArray = maxInArray(array);

        int[] arrayInPosAndNegNumber = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};  // Задача № 5
        int[] arrayOnlyPosNumber = filterArray(arrayInPosAndNegNumber);

        int[] array1 = {10, 2, 3, 4, 5, 60, 7, 8, 9}; // Задача № 6
        int totalNumberInArray = total(array1);
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
    public  static int [] filterArray (int[] array) {
        int counterPosNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counterPosNumber++;
            }
        }
        int[] arrayPosNumber = new int[counterPosNumber];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayPosNumber[j] = array[i];
                j++;
            }
        }
        return arrayPosNumber;
    }
    public static int total (int [] array){
        int counterTotal = 0;
        for ( int i = 0; i < array.length; i++){
            counterTotal += array[i];
        }
        return counterTotal;
    }

}
