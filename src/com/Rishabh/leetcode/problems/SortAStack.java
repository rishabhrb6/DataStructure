package src.com.Rishabh.leetcode.problems;

import java.util.Stack;

/*
sort a stack
 */
public class SortAStack {
    public static void sortStack(Stack<Integer> stack) {
        // Write your code here.
        if(stack.size() == 1)
            return;
        int val = stack.peek();
        stack.pop();
        sortStack(stack);
        insert(stack,val);


    }
    private static void insert(Stack<Integer> stack,int val){
        if(stack.size() == 0 || stack.peek() <= val){
            stack.push(val);
            return;
        }
        int temp = stack.pop();
        insert(stack,val);
        stack.push(temp);
    }
}
