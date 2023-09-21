package com.lalittanna.fundamentals.dataabstraction;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02 {
//    Write an Interval1D client that takes an int value N as command-line argument, reads N
//    intervals(each defined by a pair of double values) from standard input, and prints all pairs that intersect.
    public static void main(String[] args) {
        int N = 100;
        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < intervals.length; i++) {
            double min = StdRandom.uniform();
            double max = StdRandom.uniform();
            if (min > max) {
                double temp = min;
                min = max;
                max = temp;
            }
            intervals[i] = new Interval1D(min, max);
        }
        Arrays.sort(intervals, Comparator.comparingDouble(Interval1D::min));
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].max() >= intervals[j].min()) {
                    System.out.printf("Interval 1 - Min: %.3f  Max: %.3f \n", intervals[i].min(), intervals[i].max());
                    System.out.printf("Interval 2 - Min: %.3f  Max: %.3f \n", intervals[j].min(), intervals[j].max());
                    System.out.println();
                } else {
                    break;
                }
            }
        }
    }
}
