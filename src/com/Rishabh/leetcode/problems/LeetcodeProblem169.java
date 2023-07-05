package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
/*
https://leetcode.com/problems/majority-element
 */
public class LeetcodeProblem169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> checkMap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            checkMap.put(nums[i] , checkMap.getOrDefault(nums[i],0)+1);
        }
        int result = 0;
        for(Integer i : checkMap.keySet()){
            if(checkMap.get(i) > (nums.length/2)){
                result = i;
                break ;
            }
        }
        return result ;
    }
}
