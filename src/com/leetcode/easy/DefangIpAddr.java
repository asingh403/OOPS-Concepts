package com.leetcode.easy;

import java.util.Arrays;

public class DefangIpAddr {
    public static String defangIPaddr(String address) {
        String s = "";

        for(int i=0; i<address.length(); i++) {
            if (address.charAt(i) == 46) {
                s += "[.]";
            } else{
                s += address.charAt(i);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String res = defangIPaddr(address);
        System.out.println(res);

    }
}
