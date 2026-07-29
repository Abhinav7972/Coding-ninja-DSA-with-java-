import java.util.Scanner;

public class Array_2D_method {
 
public static int [][] takeInput()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter rows : ");
int rows = sc.nextInt(); 
System.out.print("Enter cols :");
int cols = sc.nextInt(); 

int a[][] = new int[rows][cols];

for(int i=0;i<rows;i++)
{
    for(int j=0;j<cols;j++)
    {
        System.out.print("Enter element at " + "a" +"["+i+"]" + "a" + "[" + j + "]");
        a[i][j] = sc.nextInt();
    }
}

sc.close();

    return a;
}


public static void printArray(int[] []arr)
{
 int r = arr.length;
 int c = arr[0].length;

 for(int i=0;i<r;i++)
 {
    for(int j=0;j<c;j++)
    {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
 }
}


    public static void main(String[] args) {
       int arr [][] = takeInput();
       printArray(arr);
    }
}