package com.company.lesson2;

public class main {
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
                arr[i] += 3;
            }
        }
    }
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (i < 6) {
               i *= 2;
            }
        }
    }
    public static void fillDiagonal() {
        int[][] matr = new int[4][4];
        for (int i = 0; i < matr.length; i++) {
            matr[i][i] = 1;
            matr[i][matr.length - 1 - i] = 1;
        }
    }

}
