//package introduction_to_java.Arrays_2;

import java.util.Scanner;

public class Array_insertion {

public static int takeInput(String str)
{
   Scanner s = new Scanner(System.in);
   System.out.println(str);

   int input = s.nextInt(); 

   return input;
  
}

public static int insert(int A [],int pos,int el,int size) {

    for(int i=size;i>pos;i--)
    {
        A[i] = A[i-1];
    }
    A[pos] = el;
    size ++;

    return size;
}



  public static void main(String[] args) {
    int cap = takeInput("Enter capicity of array :");
    int size = takeInput("Enter size of array :");
  
     int A [] = new int[cap];

    for(int i=0;i<size;i++)
    {
        A[i] = takeInput("Enter element to be inserted at " + i + "index");
    }

    int ele = takeInput("Enter element to be inserted :");
    int pos = takeInput("Enter position :");

    size = insert(A, pos, ele, size);

    for(int i:A)
    {
        System.out.print(i + " ");
    }
  }
}  
