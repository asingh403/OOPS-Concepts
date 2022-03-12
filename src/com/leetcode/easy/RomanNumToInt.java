/**
 * LeetCode 13. Roman to Integer
 */
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumToInt {

    private static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);
    }

    public static int romanToInt(String s) {

        int sum = 0;
        int i=0;

        while(i<s.length()){
            String currentSymbol = s.substring(i, i+1);
            int currentValue = values.get(currentSymbol);

            int nextValue = 0;

            if(i+1<s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }

                if(currentValue<nextValue){
                    sum = sum + (nextValue-currentValue);

                    i = i+2;
                }
                else {
                    sum = sum + currentValue;
                    i = i + 1;
                }
            }
        return sum;
        }


    public static void main(String[] args) {

        String input = "DXCI";
        String result = String.valueOf(romanToInt(input));
        System.out.println("roman no of "+ input+ " is : " + result);
    }
}
