package src.com.Rishabh.leetcode.problems;

/*

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 */
public class LeetcodeProblem189 {

    public void rotate(int[] nums, int k) {

        if(k > nums.length){
            k = k % nums.length;
        }
        if(k == 0 )
            return;

        int len = nums.length - k;
        int[] arr = new int[k];
        int l = 0;
        int m = 0;
        for(int i = len ; i < nums.length ; i++){
            arr[l] = nums[m];
            nums[m] = nums[i];
            if(l == k-1)
                l=0;
            else
                l++;
            m++;
        }
        m = 0 ;
        for(int i = k ; i < nums.length ; i++){
            int j = nums[i];
            nums[i] = arr[m];
            arr[m] = j ;
            if(m < k-1){
                m++;
            }
            else
                m=0;
        }
    }
}
