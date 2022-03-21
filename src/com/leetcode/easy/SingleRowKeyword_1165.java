//https://leetcode.com/problems/single-row-keyboard/
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyword_1165 {
    public static void calculateTime(String k, String w) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<k.length(); i++){
            map.put(k.charAt(i), i);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        String k = "pqrstuvwxyzabcdefghijklmno";
        String w = "leetcode";
        //System.out.println(calculateTime(w, k));
        calculateTime(k, w);
    }
}
