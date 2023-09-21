package com.lalittanna.fundamentals.dataabstraction;

public class Ex06 {
//    A string s is a circular rotation of a string t if it matches when the characters are circularly shifted by any number
//    of positions; e.g., ACTGACG is a circular shift of TGACGAC, and vice versa. Detecting this condition is important in the
//    study of genomic sequences. Write a program that checks whether two given strings s and t are circular shifts of one another.
    public static void main(String[] args) {
        System.out.println(isCircular("TGACGAC", "ACTGACG"));
    }

    public static boolean isCircular(String a, String b) {
        return a.length() == b.length() && (a + a).contains(b);
    }
}
