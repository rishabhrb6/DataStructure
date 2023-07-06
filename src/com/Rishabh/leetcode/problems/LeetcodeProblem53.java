package src.com.Rishabh.leetcode.problems;

/*
Given an integer array nums, find the subarray
 with the largest sum, and return its sum.
 */
public class LeetcodeProblem53 {

    public int maxSubArray(int[] nums) {
        if(nums.length <=0){
            return 0;
        }
        int runSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(runSum < 0){
                runSum =0;
            }
            runSum += nums[i];
            if(runSum > maxSum){
                maxSum = runSum;
            }
        }
        return maxSum;

    }
}
