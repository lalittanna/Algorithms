package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex19 {
//    What is the largest value of N for which this program takes less 1 hour to compute the value of F(N)?
//    Develop a better implementation of F(N) that saves computed values in an array.
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F(N));
    }

    public static long FBrute(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        long[] arr = new long[N + 1];
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[N];
    }
}
