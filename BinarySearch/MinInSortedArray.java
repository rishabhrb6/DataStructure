package BinarySearch;

public class MinInSortedArray {

    public static int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        return binarySearch(nums,start,end);
    }

    private static int binarySearch(int[] nums , int start,int end){

        if(start <= end){
            int mid = start + (end - start )/2;

            if((mid == 0 && nums[mid] < nums[mid+1] ) || (mid == nums.length-1 && nums[mid] < nums[mid - 1]) || (mid > 0 &&  mid < nums.length - 1 && nums[mid] < nums[mid + 1] && nums[mid] < nums[mid -1])){
                return nums[mid];
            }
            else if(nums[mid] > nums[end]){
                return binarySearch(nums,mid+1,end);
            }
            else{
                return binarySearch(nums,start,mid - 1);
            }
        }
        return nums[0];

    }
}
