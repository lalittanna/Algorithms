package com.lalittanna.fundamentals.basicprogrammingmodel;

import edu.princeton.cs.algs4.StdIn;

public class Ex21 {
//    Write a program that reads in lines from standard input with each line containing a name and two integers and then uses printf()
//    to print a table with a column of the names, the integers, and the result of dividing the first by the second, accurate to
//    three decimal places. You could use a program like this to tabulate batting averages for baseball players or grades for students.
    public static void main(String[] args) {
        System.out.printf("%8s %7s %7s %7s\n", "Name", "Number1", "Number2", "Result");
        while(StdIn.hasNextLine()) {
            String[] values = StdIn.readLine().split(" ");
            int Num1 = Integer.parseInt(values[1]);
            int Num2 = Integer.parseInt(values[2]);
            System.out.printf("%8s %7d %7d %7.3f\n", values[0], Num1, Num2, (double) Num1 / Num2);
        }
    }
}
