package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex14 {
//    Write a static method lg() that takes an int value N as argument and returns the largest int not larger than the base-2 logarithm of N. Do not use Math.
    public static void main(String[] args) {
        System.out.println(lg(15));
    }

    private static int lg(int N) {
        int result;
        for (result = 0; N >= 2; result++)
            N /= 2;
        return result;
    }
}
