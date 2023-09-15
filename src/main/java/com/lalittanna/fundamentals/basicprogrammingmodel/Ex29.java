package com.lalittanna.fundamentals.basicprogrammingmodel;

import java.util.Arrays;

public class Ex29 {
//    Add to BinarySearch a static method rank() that takes a key and a sorted array of int values (some of which may be equal)
//    as arguments and returns the number of elements that are smaller than the key and a similar method count() that returns
//    the number of elements equal to the key. Note: If i and j are the values returned by rank(key, a) and
//    count(key, a) respectively,then a[i..i+j-1] are the values in the array that are equal to key.
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6, 8, 8, 9, 12, 12, 45, 7, 11, 13, 13};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(rank(arr, 47));
        System.out.println(count(arr, 45));
    }

    public static int rank(int[] arr, int key) {
//        int low = 0, high = arr.length - 1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid] < key) low = mid + 1;
//            else if (arr[mid] > key) high = mid - 1;
//            else {
//                while (mid >= low && arr[mid] == key) mid--;
//                return mid + 1;
//            }
//        }
//        return low;

        // Better implementation
        return lessThanKey(arr, key);
    }

    public static int lessThanKey(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    public static int greaterThanKey(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return arr.length - low;
    }

    public static int count(int[] arr, int key) {
//        int start = rank(arr, key), count = 0;
//        while (start < arr.length && arr[start++] == key) count++;
//        return count;

        // Better implementation
        return arr.length - (lessThanKey(arr, key) + greaterThanKey(arr, key));
    }
}
