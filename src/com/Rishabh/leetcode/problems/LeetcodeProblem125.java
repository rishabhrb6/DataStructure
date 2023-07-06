package src.com.Rishabh.leetcode.problems;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class LeetcodeProblem125 {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();

        String s2 = s1.replaceAll("[^A-Za-z0-9]","");
        for(int i = 0 , j = s2.length()-1 ; i<j ; i++ , j-- ){
            if(s2.charAt(i) != s2.charAt(j)){
                return false;
            }
        }
        return true ;
    }
}
