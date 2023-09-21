package com.lalittanna.fundamentals.dataabstraction;

public class Ex12 {
//    Add a method dayOfTheWeek() that returns a String value Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday,
//    giving the appropriate day of the week for the date. You may assume that the date is in the 21st century.
    private static String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static int doomsDay21st = 1;

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(16, 1, 2019));
        System.out.println(dayOfTheWeek(29, 5, 2076));
        System.out.println(dayOfTheWeek(29, 2, 2004));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        int doomsDay = (doomsDay21st + (year - 2000) + (year - 2000) / 4) % 7;
        boolean leapYear = isLeapYear(year);
        int doomsDate = getDoomsDate(month, leapYear);
        return daysOfWeek[((doomsDay + (day - doomsDate)) % 7 + 7) % 7];
    }

    private static int getDoomsDate(int month, boolean leapYear) {
        return switch (month) {
            case 1 -> leapYear ? 4 : 3;
            case 2 -> leapYear ? 29 : 28;
            case 3 -> 14;
            case 4 -> 4;
            case 5 -> 9;
            case 6 -> 6;
            case 7 -> 11;
            case 8 -> 8;
            case 9 -> 5;
            case 10 -> 10;
            case 11 -> 7;
            case 12 -> 12;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
