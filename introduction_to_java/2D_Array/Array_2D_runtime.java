//package introduction_to_java.2D_Array;

import java.util.Scanner;

public class Array_2D_runtime {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in); 
  
   System.out.print("Enter number of rows :");
   int rows  = sc.nextInt();
   System.out.println();
   System.out.print("Enter number of coloumns :");
   int cols = sc.nextInt();
   
   System.out.println();

   int A[][] = new int[rows][cols]; 

    
   System.out.println("Enter elements :");
   for(int i=0;i<rows;i++)
   {
    for(int j=0; j<cols;j++)
    {
        System.out.print("Enter element at" + "A"+"["+i+"]" + "and" + "A"+"["+j+"]");
        A[i][j] = sc.nextInt();
    }
   }

   for(int i=0;i<rows;i++)
   {
    for(int j=0;j<cols;j++)
    {
        System.out.print(A[i][j] + " ");
    }

    System.out.println();
   }

}
}
