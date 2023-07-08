package src.com.Rishabh.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 */
public class LeetcodeProblem438 {
    public List<Integer> findAnagrams(String s, String p) {
        int i =0 ;
        int j =0 ;
        int k = p.length();
        List<Integer> result = new ArrayList<>();
        int count = 0 ;
        Map<Character,Integer> checkMap = new HashMap<>();

        for(int l =0 ; l < p.length() ; l++){
            checkMap.put(p.charAt(l) , checkMap.getOrDefault(p.charAt(l) , 0)+1);
        }
        count = checkMap.size();
        while(j < s.length()){
            if(checkMap.containsKey(s.charAt(j))){
                checkMap.put(s.charAt(j) , checkMap.get(s.charAt(j)) - 1) ;
                if(checkMap.get(s.charAt(j)) == 0){
                    count = count - 1 ;
                }
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(count == 0 ){
                    result.add(i) ;
                }
                if(checkMap.containsKey(s.charAt(i))){
                    checkMap.put(s.charAt(i) , checkMap.get(s.charAt(i)) + 1);
                    if(checkMap.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                j++ ;
                i++ ;
            }

        }
        return result ;
    }
}
