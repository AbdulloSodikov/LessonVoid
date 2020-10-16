package com.company;

public class Main {

    public static void main(String[] args) {
        int maxNum = max(15, 20);
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
