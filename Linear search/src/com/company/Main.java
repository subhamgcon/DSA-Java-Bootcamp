package com.company;

public class Main {

    public static void main(String[] args) {
	int [] num = {32,22,34,23,33,89};
    int target = 9;
    int ans = LinearSearch(num,target);
        System.out.println(ans);
    }

    // search in an array; return if the element is found
    // otherwise if item not found, return -1
    static int LinearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }


        // search the target and return the element
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if its is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
// this line will execute when no return is found
            // target not found
        }
        return -1;
    }
}
