package com.company;

public class Ceiling {
    public int[] search(int [] nums, int target) {
        int[] ans = new int[]{-1, -1};
        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(nums, target, false);
        }
        return ans;
    }

    // return the index
    // return start if it does not exist
    static int binarySearch(int [] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;




        while (start <=  end) {
            // find the middle element
            // int mid = (start + end)/2; // might be possible that (start + end) exceed the int value
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // answer found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }

        }
        return start; // we are returning start because the while loop is violated and ans does not lie between start and end.
        // as the question wants ceiling number the end is start and the start is end.
    }
}
