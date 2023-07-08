package src.com.Rishabh.DSA.SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
Given a array of integers and a window size k , find the list of maximum of all subarray of size k.
 */
public class MaximumOfSubArray {
    public List<Integer> maximumSubArray(int[] nums , int k){
        List<Integer> result = new ArrayList<>();
        int i =0 , j = 0 ;
        ArrayDeque<Integer> checkQ = new ArrayDeque<>();
        while(j < nums.length){
          while(checkQ.size() > 0 && nums[j] > checkQ.getLast()){
              checkQ.removeLast();
          }
          checkQ.add(nums[j]);

            if( j - i + 1 < k ){
                j++;
            }
            else if( j - i + 1 == k){
                result.add(checkQ.peekFirst());
                if(nums[i] == checkQ.peek()){
                    checkQ.removeFirst();
                }
                i++;
                j++;
            }

        }
        return result;
    }
}
