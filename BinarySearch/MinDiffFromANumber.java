package BinarySearch;

/*
Given a sorted array, find the element in the array which has minimum difference with the given number. .

ex :
in : 1,3,8,10,15 , key : 12
out : 10


 */
public class MinDiffFromANumber {

    public static int minDiff(int[] nums , int target){
        return binarySearch(nums, 0 , nums.length -1 ,target);

    }

    public static int binarySearch(int[] nums, int start, int end, int target){
        if(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return nums[mid];
            }
            else if(nums[mid] > target) {
                return binarySearch(nums, start, mid - 1, target);
            }
            return binarySearch(nums,mid+1,end,target);


        }
        System.out.println("start : " +start);
        System.out.println("end : " +end);
        if(end < 0){
            return nums[start];
        }
        else if(start >= nums.length - 1){
            return nums[end];
        }
        return Math.abs(target - nums[start]) - Math.abs(target - nums[end]) > 0 ? nums[end] : nums[start];
    }

//    public static int minDiffWRec(int[] nums, int target){
//
//        int start = 0;
//        int end = nums.length - 1;
//
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(nums[mid] == target){
//
//                return nums[mid];
//            }
//            else if(target < nums[mid]){
//                end = mid - 1;
//            }
//            else {
//                start = mid + 1;
//            }
//        }
//
//        return Math.abs(target - nums[start]) - Math.abs(target - nums[end]) > 0 ? nums[end] : nums[start];
//    }
}
