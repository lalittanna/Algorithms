package com.lalittanna.fundamentals.basicprogrammingmodel;

import edu.princeton.cs.algs4.StdRandom;

public class GenerateDoubles {
    public static void main(String[] args) {
        int N = 1000;
        int min = 10;
        int max = 1000;
        for (int i = 0; i < N; i++) {
            System.out.println(StdRandom.uniform() * (max - min));
        }
    }
}
