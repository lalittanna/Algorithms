package com.lalittanna.fundamentals.dataabstraction;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex01 {
//    Write a Point2D client that takes an integer value N from the command line, generates N random points in the unit square,
//    and computes the distance separating the closest pair of points.
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
            //points[i].draw();
        }
        Point2D[] xSorted = Arrays.copyOf(points, points.length);
        Arrays.sort(xSorted, Comparator.comparingDouble(Point2D::x));
        Arrays.sort(points, Comparator.comparingDouble(Point2D::y));
        System.out.println("Divide & Conquer = " + closestPair(xSorted, points));
        System.out.println("Brute Force = " + bruteForce(points));
    }

    public static double closestPair(Point2D[] xSorted, Point2D[] ySorted) {
        int n = xSorted.length;
        if (n <= 3) return bruteForce(xSorted);
        Point2D mid = xSorted[(n / 2) - 1];
        double distL = closestPair(Arrays.copyOfRange(xSorted, 0, n / 2), ySorted);
        double distR = closestPair(Arrays.copyOfRange(xSorted, n / 2, n), ySorted);
        double dist = Math.min(distL, distR);
        List<Point2D> strip = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (Math.abs(ySorted[i].x() - mid.x()) < dist)
                strip.add(ySorted[i]);
        }
        for (int i = 0; i < strip.size() - 1; i++) {
            for (int j = i + 1; j < Math.min(i + 8, strip.size()); j++)
                dist = Math.min(dist, strip.get(i).distanceTo(strip.get(j)));
        }
        return dist;
    }

    public static double bruteForce(Point2D[] points) {
        double dist = Double.MAX_VALUE;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                dist = Math.min(dist, points[i].distanceTo(points[j]));
            }
        }
        return dist;
    }
}
