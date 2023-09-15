package com.lalittanna.fundamentals.basicprogrammingmodel;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class Ex32 {
//    Suppose that the standard input stream is a sequence of double values. Write a program that takes an integer N
//    and two double values l and r from the command line and uses StdDraw to plot a histogram of the count of the numbers
//    in the standard input stream that fall in each of the N intervals defined by dividing (l , r) into N equal-sized intervals.
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]), r = Double.parseDouble(args[2]);
        double intervalLength = (r - l) / N;
        int[] intervals = new int[N];
        while (!StdIn.isEmpty()) {
            double val = StdIn.readDouble();
            if (val > r || val < l) continue;
            intervals[(int) ((val - l) / intervalLength)]++;
        }
        StdDraw.setXscale(-0.05, 1.05);
        StdDraw.setYscale(0, N + 0.05);
        for (int i = 0; i < intervals.length; i++) {
            StdDraw.filledRectangle(1.0 * i / N, intervals[i] / 2.0, 0.2 / N, intervals[i] / 2.0);
        }
    }
}
