package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 */
public class LeetcodeProblem167 {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer , Integer > checkMap = new HashMap<>();

        checkMap.put(numbers[0], 0);
        System.out.println(numbers[0]);
        int[] result = new int[2] ;

        for(int i = 1 ; i < numbers.length ; i++){
            if(checkMap.containsKey(target - numbers[i])){
                result[0] = checkMap.get(target - numbers[i]) + 1;
                result[1] = i + 1;
                break ;
            }
            checkMap.put(numbers[i] , i );
        }

        return result;
    }
}
