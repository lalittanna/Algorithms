package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex30 {
//    Write a code fragment that creates an N-by-N boolean array a[][] such that a[i][j] is true if
//    i and j are relatively prime (have no common factors), and false otherwise.
    public static void main(String[] args) {
        boolean[][] arr = new boolean[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 1 || j == 1 || (i != j && gcd(i, j) == 1)) arr[i][j] = true;
            }
        }
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }
}
