package src.com.Rishabh.leetcode.problems;

public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        // https://leetcode.com/problems/remove-element
        int k = 0;
        int l = nums.length - 1 ;
        int m = nums.length - 1 ;
        for(int i = 0 ; i <= m ; i++){
            if(nums[i] == val){
                while(l >= 0 && i < l){
                    if(nums[l] != val){
                        nums[i] = nums[l] ;
                        m--;
                        l--;
                        break ;

                    }
                    k++;
                    m--;
                    l--;
                }

                k++;
            }
        }

        return (nums.length - k) ;

    }
}
