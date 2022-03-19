//leetcode#53
package com.leetcode.easy;

import java.util.Arrays;

public class MaximumSubarray {
    public static int maximumSubarray(int [] nums){
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        // Start with the 2nd element since we already used the first one.
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }

        return maxSubarray;
    }

    public static void main(String[] args) {

        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println((maximumSubarray(arr)));

    }

}
