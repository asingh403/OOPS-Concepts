package com.common.interview.ques;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
    public static void main(String[] args) {
        String s = "aabbbccda";
        Pattern p =Pattern.compile("(.)\\1*");
        Matcher m = p.matcher(s);

        while(m.find()){
            String o = m.group();
            System.out.println(o+" - "+o.length());
        }
    }
}
