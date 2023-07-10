package src.com.Rishabh.leetcode.problems;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
https://leetcode.com/problems/valid-parentheses
 */
public class LeetcodeProblem20 {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            Character c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                s1.push(c);
            }
            else{
                if(s1.empty())
                    return false;
                Character b = s1.peek();
                if(b == '(' && c == ')' )
                    s1.pop();
                else if(b == '{' && c == '}')
                    s1.pop();
                else if(b == '[' && c == ']')
                    s1.pop();
                else
                    s1.push(c);
            }
        }
        if(s1.empty())
            return true;
        return false;
    }
}
