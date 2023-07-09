package src.com.Rishabh.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
https://leetcode.com/problems/happy-number
 */
public class LeetcodeProblem202 {

    public boolean isHappy(int n) {
        Map<Integer,Integer> checkMap = new HashMap<>();
        while(checkMap.size() == 0 || checkMap.get(n) < 2   ){
            int checkSum = 0;
            while( n / 10 != 0){
                int k = n % 10 ;
                checkSum += k * k ;
                n = n/10;
            }
            checkSum += n*n ;
            if(checkSum == 1){
                return true ;
            }
            checkMap.put(checkSum,checkMap.getOrDefault(checkSum , 0)+1);
            n = checkSum ;


        }
        return false ;
    }
}
