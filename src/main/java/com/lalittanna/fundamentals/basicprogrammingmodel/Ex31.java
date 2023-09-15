package com.lalittanna.fundamentals.basicprogrammingmodel;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Ex31 {
//    Write a program that takes as command-line arguments an integer N and a double value p (between 0 and 1),
//    plots N equally spaced dots of size .05 on the circumference of a circle, and then, with probability p
//    for each pair of points, draws a gray line connecting them.
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        double r = 1.0;
        double angle = 360.0 / N;
        // Can also use a 2D array instead: int[N][2] where columns represent the co-ordinates
        Point2D[] points = new Point2D[N];
        StdDraw.setPenRadius(.0005);
        StdDraw.setYscale(-2, 2);
        StdDraw.setXscale(-2, 2);
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point2D(r * Math.sin(angle * i), r * Math.cos(angle * i));
            points[i].draw();
        }
        StdDraw.setPenColor(Color.GRAY);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (StdRandom.bernoulli(p))
                    StdDraw.line(points[i].x(), points[i].y(), points[j].x(), points[j].y());
            }
        }
    }
}
