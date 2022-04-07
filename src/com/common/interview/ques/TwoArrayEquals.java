package com.common.interview.ques;

import java.util.HashSet;
import java.util.Set;

public class TwoArrayEquals {

    public static boolean arrayCompare(int[] a, int[] b) {

        if(a.length != b.length) return false;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            if (set.add(b[j])) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9};
        int[] b = {3, 4, 6, 7, 9};

        boolean res = arrayCompare(a, b);
        System.out.println(res);
    }
}
