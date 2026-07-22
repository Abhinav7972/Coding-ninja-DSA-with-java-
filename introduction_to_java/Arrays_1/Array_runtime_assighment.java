import java.util.Scanner;
public class Array_runtime_assighment {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int arr [] = new int[5];
    
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("Enter element at index :" + i);
        arr[i] = s.nextInt();
    }

    s.close();
    System.out.println();

    for(int i:arr)
    {
        System.out.print(i + " ");
    }
  }
}
