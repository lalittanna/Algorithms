package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex09 {
//    Write a code fragment that puts the binary representation of a positive integer N
//    into a String s.
    public static void main(String[] args) {
        System.out.println(intToBinary(10));
    }

    public static String intToBinary(int N) {
        // Can also use Integer.toBinaryString(N);
        StringBuilder binary = new StringBuilder();
        for (int n = N; n > 0; n /= 2)
            binary.insert(0, n % 2);
        return binary.toString();
    }
}
