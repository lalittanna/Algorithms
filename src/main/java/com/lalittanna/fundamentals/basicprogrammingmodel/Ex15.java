package com.lalittanna.fundamentals.basicprogrammingmodel;

import java.util.Arrays;

public class Ex15 {
//    Write a static method histogram() that takes an array a[] of int values and an integer M as arguments and
//    returns an array of length M whose ith entry is the num- ber of times the integer i appeared in the argument array. I
//    f the values in a[] are all between 0 and M–1, the sum of the values in the returned array should be equal to a.length.
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 9};
        System.out.println(Arrays.toString(histogram(b, 7)));
    }

    public static int[] bruteForce(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < result.length; i++) {
            int val = 0;
            for (int j : a) {
                if (j == i) val++;
            }
            result[i] = val;
        }
        return result;
    }

    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M) {
                result[a[i]]++;
            }
        }
        return result;
    }
}
