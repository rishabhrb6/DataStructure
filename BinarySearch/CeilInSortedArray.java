package BinarySearch;

/*
Given a sorted array and a value x, the ceiling of x is the smallest element in an array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
Assume that the array is sorted in non-decreasing order. Write efficient functions to find the floor and ceiling of x.

For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array
 */
public class CeilInSortedArray {

    public static int findCeil(int[] nums, int target){
        return binarySearch(nums,0, nums.length-1, target,Integer.MAX_VALUE);
    }

    private static int binarySearch(int[] nums, int start , int end, int target,int res){

        int mid = start + (end - start)/2;

        if(start <= end){

            if(target == nums[mid]){
                return nums[mid];
            }
            else if(target < nums[mid]){

                return binarySearch(nums, start, mid -1, target, Math.min(res,nums[mid]));
            }
            return binarySearch(nums,mid+1,end,target,res);
        }
        return res;

    }
}
