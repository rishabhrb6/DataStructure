package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
https://leetcode.com/problems/next-greater-element-i
 */
public class LeetcodeProblem496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> checkS = new Stack<>();

        Map<Integer,Integer> checkMap = new HashMap<>();
        int[] result = new int[nums1.length] ;
        for(int i = nums2.length - 1 ; i >=0 ;i--){
            if(checkS.isEmpty()){
                checkMap.put(nums2[i],-1);
            }
            else if(checkS.peek() > nums2[i]){
                checkMap.put(nums2[i] , checkS.peek());

            }
            else{
                while(!checkS.isEmpty() && checkS.peek() < nums2[i]){
                    checkS.pop();
                }
                if(checkS.isEmpty()){
                    checkMap.put(nums2[i] , -1);

                }
                else if(checkS.peek() > nums2[i]){
                    checkMap.put(nums2[i] , checkS.peek());

                }
            }
            checkS.push(nums2[i]);
        }
        for(int i =0 ; i < nums1.length ; i++){
            result[i] = checkMap.get(nums1[i]);
        }

        return result ;

    }
}
