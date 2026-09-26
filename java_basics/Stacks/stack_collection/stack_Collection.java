package java_basics.Stacks.stack_collection;

import java.util.Stack;

public class stack_Collection {
    
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        int arr [] =  {1,2,3,4,5,6,7,8,9,10};

        for(int ele : arr)
        {
            stack.push(ele);
        }

        System.out.println(stack.peek());
       

        System.out.println();
        for(int ele : arr)
        {
            System.out.print(stack.pop() + " ");
        }

    }
}
