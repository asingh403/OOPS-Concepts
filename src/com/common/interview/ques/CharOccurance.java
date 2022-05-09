package com.common.interview.ques;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharOccurance {
    public static void charCount(String st){

        char [] ch = st.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(Character c: ch){
            if (charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }else{
                charMap.put(c, 1);
            }
        }
        Set<Character> charInString = charMap.keySet();

        for(Character w: charInString){
            if (charMap.get(w)>1){
                System.out.println(w+" => "+ charMap.get(w));
            }
        }
    }

    public static void main(String[] args) {
        charCount("pyaahppl");
    }
}
