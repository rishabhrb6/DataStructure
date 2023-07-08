package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeProblem205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> checkMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i =0 ; i < s.length() ; i++){
            if(checkMap.containsKey(s.charAt(i)) || checkMap.containsValue(t.charAt(i))){
                if(!checkMap.containsKey(s.charAt(i)) || checkMap.containsKey(s.charAt(i)) && t.charAt(i) != checkMap.get(s.charAt(i))){
                    return false;
                }

            }
            else{
                checkMap.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;

    }
}
