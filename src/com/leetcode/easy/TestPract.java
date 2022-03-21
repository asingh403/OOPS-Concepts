//https://leetcode.com/problems/single-row-keyboard/
package com.leetcode.easy;

import java.util.HashMap;

public class TestPract {
    public static int calculateTime(String keyboard, String word) {
        int totalTime = 0;
        int i=0;
        char prevChar;

        HashMap<String,Integer> ht = new HashMap <String,Integer>();

        for (char c : keyboard.toCharArray()){
            ht.put(Character.toString(c), i++);
        }

        prevChar = word.charAt(0);
        totalTime = ht.get(Character.toString(prevChar));

        for(char c1 : word.toCharArray()){
            totalTime += Math.abs(ht.get(Character.toString(c1))- ht.get(Character.toString(prevChar)));
            prevChar = c1;
        }
        return totalTime;
    }

    public static void main(String[] args) {

        String k = "pqrstuvwxyzabcdefghijklmno";
        String w = "leetcode";
        System.out.println(calculateTime(k, w));
    }
}
