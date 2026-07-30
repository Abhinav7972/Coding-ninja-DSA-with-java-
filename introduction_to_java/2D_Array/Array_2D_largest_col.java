import java.util.*;
public class Array_2D_largest_col {

  public static int[][]takeInput()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows :");
    int rows = sc.nextInt();
    System.out.print("Enter cols :");
    int cols = sc.nextInt(); 
    int a[][] = new int[rows][cols];
    
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print("Enter element at " + "a" + "[ "+ i + "]" + "[" + j +"]");
            a[i][j] = sc.nextInt();
        }
    }
    sc.close();
    return a;
  }

  public static  int largeCol(int arr[] [])
  {
   int r=arr.length;
   int c = arr[0].length; 
   int largest = Integer.MIN_VALUE;
  for(int j =0;j<c;j++)
  {
    int sum =0;
    for(int i=0;i<r;i++)
    {
      sum+=arr[i][j];
    }

    if(sum>largest)
    {
        largest=sum;
    }
  }

   return largest;
  }



  public static void printArr(int arr[][])
  {

   int r = arr.length;
   int c = arr[0].length;
   int largeColsum = largeCol(arr);
   for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
     System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   } 
 
   System.out.println("Largest column sum in array is :" + largeColsum);

  }

 public static void main(String[] args) {

  int arr [][] = takeInput();
  printArr(arr);

 }
}
