package src.com.Rishabh.leetcode.problems;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class LeetcodeProblem392 {
    public boolean isSubsequence(String s, String t) {
        int count = 0 ;

        int i=0 , j= 0 ;

        while(i < s.length() && j < t.length()){
            if( s.charAt(i) == t.charAt(j)){
                i = i+1;
                count = count + 1;
                if(count == s.length() )
                {
                    break;
                }
            }
            j++ ;
        }

        if(count == s.length() ){
            return true;
        }
        return false;

    }
}
