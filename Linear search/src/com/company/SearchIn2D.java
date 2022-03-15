package com.company;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,7},
                {3,45,67},
                {34,56,78,90},
                {78,89,91,100}
        };
        int target = 100;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int search(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element: ints) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;
    }
}
