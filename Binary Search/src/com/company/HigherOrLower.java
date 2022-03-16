package com.company;

public class HigherOrLower {
    public static void main(String[] args) {
        int nums = 10;
        int target = 6;
        int ans = guessNumber(nums,target);
        System.out.println(ans);
    }
    public static int guessNumber(int nums, int target) {
        int start = 0;
        int end = nums;
        int mid = start + (end - start)/2;
        while(start <= end){
            if(nums == target){
                return 0;
            } else if(target >= mid){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
