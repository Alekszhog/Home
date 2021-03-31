package com.company.lesson2;

public class main {
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0
            } else {
                arr[i] = 1
                        arr[i] = (arr[i] + 1) % 2;
            }
        }
    }
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr [i] += 3;
        }
    }
    public static void changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (i < 6) {
               i *= 2
            }
        }
    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                i == 1 && j == 1;
            }
        }
    }

}
