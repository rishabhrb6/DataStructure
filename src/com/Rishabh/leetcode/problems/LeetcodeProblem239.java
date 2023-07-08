package src.com.Rishabh.leetcode.problems;

import java.util.ArrayDeque;

/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window
https://leetcode.com/problems/sliding-window-maximum
 */
public class LeetcodeProblem239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int i =0 , j = 0 ;
        int o =0 ;
        ArrayDeque<Integer> checkQ = new ArrayDeque<>();
        while(j < nums.length){
            while(checkQ.size() > 0 && nums[j] > checkQ.getLast()){
                checkQ.removeLast();
            }
            checkQ.add(nums[j]);

            if( j - i + 1 < k ){
                j++;
            }
            else if( j - i + 1 == k){
                result[o++] = checkQ.peekFirst();
                if(nums[i] == checkQ.peek()){
                    checkQ.removeFirst();
                }
                i++;
                j++;
            }

        }
        return result;
    }
}
