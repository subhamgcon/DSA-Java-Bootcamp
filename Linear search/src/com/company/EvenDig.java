package com.company;

public class EvenDig {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
        System.out.println(digits(0));

    }

    static int findNumbers(int [] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)){
                count++;
            }
            
        }
        return count;
    }
    // function to check the number of digits are even or not
    static  boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    // count the number of digits in a number.
    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        if (num == 0){
            return 1;
        }


        return count;
    }
}
