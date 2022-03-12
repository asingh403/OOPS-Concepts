package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            //target = cur+x;
            //cur = target-x
            //x = target-curr;
            int x = target-curr;
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;

    }

    public static void main(String[] args) {
        int nums[] = {2, 11, 7, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


}
