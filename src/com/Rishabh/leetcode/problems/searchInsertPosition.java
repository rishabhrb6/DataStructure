package src.com.Rishabh.leetcode.problems;

public class searchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // https://leetcode.com/problems/search-insert-position
        int i = 0;
        while( i < nums.length && nums[i] <= target){
            if(target == nums[i]){
                return i;
            }
            else{
                i++;
            }
        }
        return i;
    }
}
