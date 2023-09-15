package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex11 {
//    Write a code fragment that prints the contents of a two-dimensional boolean array, using * to represent true and
//    a space to represent false. Include row and column numbers.
    public static void main(String[] args) {
        boolean[][] arr = new boolean[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.random() > 0.5;
            }
        }
        printBool2DArray(arr);
    }

    private static void printBool2DArray(boolean[][] arr) {
        System.out.print(" ");
        for (int i = 1; i <= arr.length; i++)
            System.out.printf(" %d", i);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", i + 1);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" %s", arr[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }
}
