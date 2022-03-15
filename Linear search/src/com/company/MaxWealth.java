package com.company;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        // using 2D array looping persons as rows and accounts as cols
        for (int[] ints : accounts) {
            // when you start a new column, take a new sum for a row.
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            // now we have sum of accounts of person
            // check with overall sum
            if (sum > ans) {
                ans = sum;

            }
        }
        return ans;

    }
}
