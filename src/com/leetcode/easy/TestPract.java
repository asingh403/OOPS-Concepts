//https://leetcode.com/problems/single-row-keyboard/
package com.leetcode.easy;

import java.util.HashMap;

public class TestPract {

    public static void main(String[] args) {
        String s = "A2:F1";
        char startC = s.charAt(0);
        int startR = s.charAt(1)-'0';

        char endC = s.charAt(3);
        int endR = s.charAt(4) - '0';

        System.out.println(startR +" : "+ endR);

    }
}
