package BinarySearch;

/*
Given a bitonic sequence of n distinct elements, write a program to find a given element x in the bitonic sequence in O(log n) time.
A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.

Examples:

Input :  arr[] = {-3, 9, 8, 20, 17, 5, 1};
         key = 20
Output : Found at index 3

 */
public class SearchInBitonicArray {
    public static int solve(int[] A, int B) {
        int peak = peak(A,0,A.length-1);
        if(A[peak] == B){
            return peak;
        }
        else if(A[peak] < B){
            return -1;
        }
        int a = binary(A,0,peak - 1,B,true);
        int b = binary(A, peak,A.length-1,B,false);
        return a > b ? a : b;
    }

    private static int peak(int[] nums, int start, int end){

        if(start <= end){
            int mid = start + (end- start)/2;

            if(mid > 0 && mid < nums.length - 1 && nums[mid] > nums[mid -1] && nums[mid] > nums[mid+1] ){
                return mid;
            }
            else if(nums[mid] < nums[mid+1]){
                return peak(nums,mid+1,end);
            }
            else{
                return peak(nums,start,mid -1);
            }

        }
        return -1;
    }

    private static int binary(int nums[], int start,int end, int target,boolean asc){

        if(start <= end){

            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if (target < nums[mid]){
                if(asc){
                return binary(nums, start, mid -1 , target,asc);}
                else{
                    return binary(nums,mid +1,end,target,asc);
                }

            }
            else{
                if(asc){
                return binary(nums, mid+1 , end , target,asc);}
                else{
                    return binary(nums,start,mid-1,target,asc);
                }
            }
        }
        return -1;
    }
}