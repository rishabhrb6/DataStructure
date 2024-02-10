package BinarySearch;

/*
Given a sorted array consisting 0s and 1s. The task is to find the index of first 1 in the given array.

Input :
arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
Output :
6

Input :
arr[] = {0, 0, 0, 0}
Output :
-1
 */
public class ElementInSortedArrayInfiniteNumbers {

    public static int findFirst(int nums[]){
        int res = binarySearch(nums,0,nums.length -1,Integer.MAX_VALUE);
        if(res == Integer.MAX_VALUE) return -1;
        return res;

    }

    public static int binarySearch(int[] nums, int start , int end, int res){

        int mid = start + (end - start)/2;
        if(start<=end){

            if(nums[mid] == 1){
                return binarySearch(nums,start,mid-1,Math.min(res,mid));
            }
            else if(nums[mid] < 1){
                return binarySearch(nums,mid + 1,end,res);
            }
        }
        return res;
    }



    
}
