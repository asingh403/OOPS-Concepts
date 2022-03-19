package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {

    public static boolean containsDuplicate(int[] nums) {

        int n = nums.length;
        Set<Integer> s = new HashSet<>();

        for(int i=0; i< n; i++){
            if(!s.add(nums[i])){
                return true;
            }
        }
            return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }
}
