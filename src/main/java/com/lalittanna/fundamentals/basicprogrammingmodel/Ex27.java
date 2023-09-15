package com.lalittanna.fundamentals.basicprogrammingmodel;

import java.util.Arrays;

public class Ex27 {
//    Develop a better implementation that is based on saving computed values in an array.
    public static void main(String[] args) {
        double[][] arr = new double[101][50 + 1];
        for (double[] doubles : arr) Arrays.fill(doubles, -1);
        //System.out.println(binomial(100, 50, 0.1));
        System.out.println(efficientBinomial(100, 50, 0, arr));
    }

    public static double binomial(int N, int k, double p) {
        if (N == 0 || k < 0) return 1.0;
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double efficientBinomial(int N, int k, double p, double[][] arr) {
        if (N == 0 || k < 0) return 1.0;
        if (arr[N][k] == -1) {
            arr[N][k] = (1.0 - p) * efficientBinomial(N - 1, k, p, arr) + p * efficientBinomial(N - 1, k - 1, p, arr);
        }
        return arr[N][k];
    }
}
