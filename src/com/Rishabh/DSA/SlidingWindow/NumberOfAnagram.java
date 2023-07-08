package src.com.Rishabh.DSA.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
Given a String S1 and String S2 , we have to find the number of occurences of anagram in s2.
let s1 = "forxlnmorfuhasrof" , s2 = "for" , output should be 3
 */
public class NumberOfAnagram {

    public int  occcurencesAnagram(String s1 , String s2){
        int i =0 ;
        int j =0 ;
        int k = s2.length();
        int result = 0;
        int count = 0 ;
        Map<Character,Integer> checkMap = new HashMap<>();

        for(int l =0 ; l < s2.length() ; l++){
            checkMap.put(s2.charAt(l) , checkMap.getOrDefault(s2.charAt(l) , 0)+1);
        }
        count = checkMap.size();
        while(j < s1.length()){
            if(checkMap.containsKey(s1.charAt(j))){
                checkMap.put(s1.charAt(j) , checkMap.get(s1.charAt(j)) - 1) ;
                if(checkMap.get(s1.charAt(j)) == 0){
                    count = count - 1 ;
                }
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(count == 0 ){
                    result++ ;
                }
                if(checkMap.containsKey(s1.charAt(i))){
                    checkMap.put(s1.charAt(i) , checkMap.get(s1.charAt(i)) + 1);
                    if(checkMap.get(s1.charAt(i)) == 1) {
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
