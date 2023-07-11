package src.com.Rishabh.leetcode.problems;

/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
https://leetcode.com/problems/binary-search
 */
public class LeetcodeProblem704 {
    public int search(int[] nums, int target) {

        int i = 0 , j = nums.length - 1 ;
        while(i <= j){
            int mid = (j + i)/2 ;
            if( nums[mid] == target){
                return mid;
            }
            else if( target > nums[mid]){
                i = mid + 1;
            }
            else if(target < nums[mid]){
                j = mid - 1 ;
            }
        }
        return -1 ;
    }
}
