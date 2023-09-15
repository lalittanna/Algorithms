package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex33 {
    // Matrix library
    public static void main(String[] args) {
        // Vector dot product
        double[] x = { 2.0, 3.0, 4.0 };
        double[] y = { 3.0, 2.0, 5.5 };

        System.out.println("Dot: " + dot(x, y));

        // Matrix-matrix product
        double[][] a = {
                { 1, 2 }
        };
        double[][] b = {
                { 2, 3, 4 },
                { 2, 3, 4 }
        };
        double[][] c = mult(a, b);

        System.out.println("\nMatrix multiplication:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose
        double[][] d = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        double[][] e = transpose(d);

        System.out.println("\nTranspose:");
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[0].length; j++) {
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix-vector product
        double[][] f = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        double[] g = { 1, 2, 3 };

        double[] h = mult(f, g);

        System.out.println("\nMatrix-vector product:");
        for (int i = 0; i < h.length; i++) {
            System.out.print(h[i] + " ");
        }

        System.out.println();
        // Vector-matrix product
        double[] i = { 1, 2 };

        double[][] j = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        double[] k = mult(i, j);

        System.out.println("\nVector-matrix product:");
        for (int l = 0; l < k.length; l++) {
            System.out.print(k[l] + " ");
        }
    }

    // Vector dot product
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) return Double.NaN;
        double dotProduct = 0.0;
        for (int i = 0; i < x.length; i++) {
            dotProduct += x[i] * y[i];
        }
        return dotProduct;
    }

    // Matrix-matrix product
    public static double[][] mult(double[][] a, double[][] b) {
        if (a == null || b == null || a.length == 0 || a[0] == null || b.length == 0 || b[0] == null || a[0].length != b.length) return null;
        double[][] product = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    // Transpose
    public static double[][] transpose(double[][] a) {
        if (a == null || a.length == 0) return a;
        double[][] result = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    // Matrix-vector product
    public static double[] mult(double[][] a, double[] x) {
        if (a == null || x == null || a.length == 0 || a[0].length != x.length) return null;
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i] += a[i][j] * x[j];
            }
        }
        return result;
    }

    // Vector-matrix product
    public static double[] mult(double[] y, double[][] a) {
        if (a == null || y == null || a.length == 0 || a.length != y.length) return null;
        double[] result = new double[a[0].length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < y.length; j++) {
                result[i] += a[j][i] * y[j];
            }
        }
        return result;
    }
}
