package src.com.Rishabh.DSA.Recursion;

import java.util.List;

/*
sort an array using recursion . 
 */
public class SortArray {
    public void sort(List<Integer> nums){

        if(nums.size() == 1){
            return ;
        }
        int val = nums.get(nums.size() - 1);
        nums.remove(nums.size() -1);
        sort(nums);
        insert(nums,val);

    }

    private void insert(List<Integer> nums , int val){
        if(nums.size() == 0 || val >= nums.get(nums.size() - 1)){
            nums.add(val);
            return;
        }

        int temp = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        insert(nums , val);
        nums.add(temp);


    }
}
