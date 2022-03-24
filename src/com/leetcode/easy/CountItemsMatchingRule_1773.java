package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule_1773 {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int matches=0;
        int rowLength=items.size();
        int columnLength=items.get(0).size();
        for(int i=0;i<rowLength;i++){
            if(ruleKey.equals("type")){
                if(items.get(i).get(0).equals(ruleValue)) matches++;
            }
            else if(ruleKey.equals("color")){
                if(items.get(i).get(1).equals(ruleValue)) matches++;

            }
            else{
                if(items.get(i).get(2).equals(ruleValue)) matches++;
            }
        }
        return matches;
    }

    public static void main(String[] args) {
        List<String> friends =  new ArrayList<>();

        List<List<String>> items = new ArrayList<>();
        items.add((List.of("phone","blue","pixel")));
        items.add((List.of("computer","silver","phone")));
        items.add((List.of("phone","gold","iphone")));

        System.out.println(items.get(0));
        System.out.println(items.get(1));
        System.out.println(items.get(2));
        System.out.println(items.size());

        String ruleKey = "color";
        String ruleValue = "silver";

        int res= countMatches(items, ruleKey, ruleValue);
        System.out.println("Matching -> "+res);
    }
}
