// Reverse the stack using O(1) space complexity

// 1: pop the top and reverse the remaining stack
// 2: when stack is empty push element at the bottom of stack

import java.util.*;


public class ReverseStack {

    // push at bottom
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // reverse 
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);

            reverse(s);
           
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }   
    }
}


