package com.lalittanna.fundamentals.basicprogrammingmodel;

import java.util.Arrays;

public class Ex13 {
//    Write a code fragment to print the transposition (rows and columns changed) of a two-dimensional array with M rows and N columns.
    public static void main(String[] args) {
        int[][] arr = new int[5][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
        System.out.println("Before transposition " + Arrays.deepToString(arr));
        System.out.println("After transposition " + Arrays.deepToString(transposition(arr)));
    }

    public static int[][] transposition(int[][] arr) {
        if (arr == null || arr.length == 0) return null;
        int[][] result = new int[arr[0].length][arr.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }
}
