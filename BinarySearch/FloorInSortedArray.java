package BinarySearch;

/*
Given a sorted array and a value x, the floor of x is the largest element in the array smaller than or equal to x.
 Write efficient functions to find the floor of x

 Input: arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 5
Output: 2
Explanation: 2 is the largest element in
arr[] smaller than 5

Input: arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 20
Output: 19
Explanation: 19 is the largest element in
arr[] smaller than 20
 */

public class FloorInSortedArray {

    public static int floor(int[] nums, int target){
     return binarySearch(nums, 0 , nums.length - 1 , target , Integer.MIN_VALUE);

    }

    private static int binarySearch(int[] nums , int start, int end , int target , int res){
        int mid = start + (end - start)/2;
        if(start <= end){
            if(target == nums[mid]){
                return nums[mid];
            }
            else if(nums[mid] > target){
                return binarySearch(nums,start,mid - 1,target,res);

            }
            else{
                return binarySearch(nums,mid + 1,end, target, Math.max(res,nums[mid]));
            }

        }
        return res;

    }


}
