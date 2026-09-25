package java_basics.Stacks.Stack_Using_array;

public class stackUse {
    
    public static void main(String[] args) throws stackFullException, stackEmptyException {
        stackUsingArrays stack = new stackUsingArrays();

        int arr [] = {5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i=0;i<arr.length;i++)
        {
          stack.push(arr[i]);
        }
   
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


        // stack.push(10);
        // System.out.println(stack.top());
        // stack.Size();
        // System.out.println(stack.isEmpty());
    }
}
