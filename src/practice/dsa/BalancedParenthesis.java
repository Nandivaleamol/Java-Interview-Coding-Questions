package practice.dsa;

//Problem statement: Write a java program to check balanced parenthesis.
/*
input: {([()])}
output: Balanced Parenthesis

input: (([()])
output: Not a Balanced Parenthesis
 */

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else if (c==')' || c=='}' || c==']'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (!((c==')'&&top=='(') || (c=='}'&&top=='{') || (c==']')&&top=='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{([()])}";

        if (isBalanced(input)){
            System.out.println("Balanced Parenthesis");
        }else{
            System.out.println("Not a Balanced Parenthesis");
        }
    }
}
