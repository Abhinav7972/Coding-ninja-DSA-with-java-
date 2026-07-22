import java.util.Scanner;

public class Array_sum_of_element {
 public static void main(String[] args) {
 int arr[] =  new int[5];
 
 Scanner s = new Scanner(System.in);
 

 for(int i=0;i<arr.length;i++)
 {
    System.out.print("Enter value at " + i + "index  :");
    arr[i] = s.nextInt();

 }

 s.close();

 System.out.println();
 int sum=0;
 for(int i:arr)
 {
  sum+=i;
 }
 System.out.println(sum);
 }
}
