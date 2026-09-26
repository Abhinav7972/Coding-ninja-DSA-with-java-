package java_basics.Stacks.stack_problems;

import java.util.Stack;

public class balanceParenthesis {
     
    private static boolean isMatchingPair(char open,char close)
    {
      return  (open == '(' && close == ')') || 
      (open == '{' && close == '}') ||
      (open == '[' && close == ']');
    }


    public  static  boolean isBalanced(String expr)
    {
      //String expr = "{[()]}";

        Stack<Character> stack = new Stack<>();

        for(char ch : expr.toCharArray())
        {
          if (ch=='(' || ch== '{' || ch == '[') {
            stack.push(ch);
          }
          else if (ch==')' || ch== '}' || ch == ']') {
            if (stack.isEmpty() || !isMatchingPair(stack.peek(),ch)) {
                return  false;
            }
            stack.pop();
          }
        } 

        return  stack.isEmpty();
    }
    
    public static void main(String[] args) {
     System.out.println(isBalanced("{}"));
     System.out.println(isBalanced("{([])}"));
     System.out.println(isBalanced("{([]}"));
    }
}
