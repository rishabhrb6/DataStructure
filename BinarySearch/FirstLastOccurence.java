package BinarySearch;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */
public class FirstLastOccurence {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        int start = 0;
        int end = nums.length -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                res[0] = mid;
                end = mid -1;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                res[1] = mid;
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return res;

    }
}
