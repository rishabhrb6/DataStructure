package src.com.Rishabh.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        int k = 1;
        while(k <= numRows){
            List<Integer> checkResult = new ArrayList<>();
            if(k==1){
                checkResult.add(1);
                result.add(checkResult);
            }
            else if(k == 2){
                checkResult.add(1);
                checkResult.add(1);
                result.add(checkResult);
            }
            else{
                List<Integer> checkList = result.get(k-2);
                checkResult.add(1);
                for(int i =0 ; i < checkList.size() - 1 ; i++){
                    checkResult.add(checkList.get(i) + checkList.get(i+1));
                }
                checkResult.add(1);
                result.add(checkResult);
            }
            k++;
        }
        return result;


    }
}
