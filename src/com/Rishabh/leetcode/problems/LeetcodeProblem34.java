package src.com.Rishabh.leetcode.problems;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class LeetcodeProblem34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1 ;
        res[1] = -1 ;
        int i = 0 , j = nums.length-1;
        while(i <= j){
            int mid = (j+i)/2 ;
            if(target == nums[mid]){
                int l = mid ;
                int m = mid ;
                while(l <= j && target == nums[l]){
                    l++;
                }
                res[1] = l - 1;
                while(m >= i && target == nums[m]){
                    m--;
                }
                res[0] = m + 1 ;
                break ;
            }

            else if(target < nums[mid]){
                j = mid -1 ;
            }
            else if(target > nums[mid]){
                i = mid + 1 ;
            }
        }
        return res ;
    }
}
