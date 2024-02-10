package BinarySearch;

/*
Given a sorted array arr[] of size N, some elements of array are moved to either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1] i.e.
arr[i] can only be swapped with either arr[i+1] or arr[i-1]. The task is to search for an element in this array.
Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
Output: 2
Explanation: Output is index of 40 in given array i.e. 2

Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 90
Output: -1
Explanation: -1 is returned to indicate the element is not present
 */
public class SearchInAlmostSortedArray {

    public static int search(int[] nums , int target){
        return binarySearch(nums,0, nums.length - 1 , target);
    }

    public static int binarySearch(int[] nums, int start, int end, int target){
        int mid = start + (end - start)/2;
        if(start <= end){

            if(target == nums[mid])
                return mid;
            if(mid > start && target == nums[mid-1])
                return mid -1;
            if(mid < end && target == nums[mid + 1])
                return mid+1;
            else if(target > nums[mid]){
                return binarySearch(nums,mid+2,end,target);
            }
            else{
                return binarySearch(nums,start,mid-2,target);
            }
        }
        return -1;
    }
}
