package src.com.Rishabh.leetcode.problems;

public class LeetcodeProblem779 {
    public int kthGrammar(int n, int k) {
        if(n == 1 && k == 1)
            return 0;
        int mid = (int) Math.pow(2, n - 1 ) / 2 ;
        if(k <= mid){
            return kthGrammar(n-1 , k);
        }
        else{
            int k1 =  ~kthGrammar(n-1, k - mid);
            if(k1 == -1){
                return 1;
            }
            else
                return 0;
        }

    }
}
