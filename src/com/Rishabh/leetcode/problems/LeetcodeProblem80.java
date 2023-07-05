package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeProblem80 {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> checkMap = new HashMap<>();
        int m = nums.length;

        for(int i = 0 ; i < m ; ){
            checkMap.put(nums[i], checkMap.getOrDefault(nums[i],0)+1);
            if(checkMap.get(nums[i]) > 2){
                for(int j = i ; j < m - 1 ; j++){
                    nums[j] = nums[j+1];
                }
                m--;
                continue ;
            }
            i++ ;
        }
        return m;
    }

    }

