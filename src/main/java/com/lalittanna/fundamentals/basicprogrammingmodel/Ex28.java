package com.lalittanna.fundamentals.basicprogrammingmodel;

import java.util.Arrays;

public class Ex28 {
//    Modify the test client in BinarySearch to remove any duplicate keys in the whitelist after the sort.
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6, 8, 8, 9, 12, 12, 45, 7, 11, 13, 13};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates(int[] arr) {
        int duplicates = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) duplicates++;
        }
        int[] result = new int[arr.length - duplicates];
        result[0] = arr[0];
        for (int i = 1, j = 0; i < arr.length; i++) {
            if (arr[i] != result[j]) result[++j] = arr[i];
        }
        return result;
    }
}
