package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeProblem242 {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> checkMap = new HashMap<>();
        for(int i =0 ; i < s.length() ; i++){
            checkMap.put(s.charAt(i),checkMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i =0 ; i < t.length() ;i++){
            if(!checkMap.containsKey(t.charAt(i)) || checkMap.get(t.charAt(i)) < 1 ){
                return false;
            }
            else{
                checkMap.put(t.charAt(i) , checkMap.get(t.charAt(i)) - 1);
            }
        }
        return true;
    }
}
