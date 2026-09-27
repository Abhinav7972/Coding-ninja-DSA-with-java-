package java_basics.Stacks.stack_problems;
import  java.util.Stack;

public class reverseStack {
    
 public static void insertAtBottom(Stack<Integer> stack, int item)
 {
    if(stack.isEmpty()) {
        stack.push(item);
    }
    else 
    {
        int temp = stack.pop();
        insertAtBottom(stack, item);
        stack.push(temp);
    }
 }


 public  static  void reverse(Stack<Integer>stack)
 {
    if (!stack.isEmpty()) {
        int temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
    }
 }


 public static void main(String[] args) {
    int arr [] = {4,3,2,1};
    Stack<Integer> stack = new Stack<>();

    for(int el : arr)
    {
     stack.push(el);
    } 
    
    reverse(stack);
    
    while (!stack.isEmpty()) 
    {
     System.out.println(stack.pop());
    } 


 }
 
}
