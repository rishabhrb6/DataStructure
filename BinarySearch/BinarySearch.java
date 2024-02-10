package BinarySearch;
/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {

    public static int search(int[] nums, int target) {
        return binarySearchh(nums,0,nums.length-1,target);
    }

    private static int binarySearchh(int[] num, int start , int end , int target){
        if(start <= end){
            int mid = start + (end - start)/2;
            if(target == num[mid]){
                return mid;
            }
            else if(target > num[mid]){
                return binarySearchh(num,mid+1,end,target);
            }
            else{
                return binarySearchh(num,start,mid-1,target);
            }
        }
        return -1;
    }
}
