package com.lalittanna.fundamentals.basicprogrammingmodel;

public class Ex22 {
//    Write a version of BinarySearch that uses the recursive rank() given on page 25 and traces the method calls.
//    Each time the recursive method is called, print the argument values lo and hi, indented by the depth of the recursion.
//        Hint: Add an argument to the recursive method that keeps track of the depth.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 17};
        System.out.println(rank(arr, 12, 0, arr.length - 1, 1));
    }

    public static int rank(int[] arr, int key, int low, int high, int depth) {
        System.out.printf("%" + depth + "d %" + depth + "d\n", low, high);
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] < key) return rank(arr, key, mid + 1, high, ++depth);
        else if (arr[mid] > key) return rank(arr, key, low, mid - 1, ++depth);
        return mid;
    }
}
