package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // https://leetcode.com/problems/two-sum
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++ ){
            m.put(nums[i],i);
        }
        for(int j = 0 ; j < nums.length ; j++){
            if(m.containsKey(target - nums[j])){
                res[0] = j;
                res[1] = m.get(target - nums[j]);
                if(res[0] != res[1]){
                    break ;
                }
            }
        }
        return res;

    }
}
