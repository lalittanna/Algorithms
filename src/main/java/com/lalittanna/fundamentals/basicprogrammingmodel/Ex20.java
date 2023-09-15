package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex20 {
//    Write a recursive static method that computes the value of ln(N!)
    public static void main(String[] args) {
        System.out.println(lnFactorial(5));
    }

    private static double lnFactorial(int N) {
        if (N <= 1) return 0;
        return Math.log(N) + lnFactorial(N - 1);
    }
}
