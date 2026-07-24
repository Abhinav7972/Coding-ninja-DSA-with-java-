import java.util.*;
public class Array_shift_zero {

public static void swap(int [] arr, int nz, int z)
{
int temp = arr[z];
arr[z]=arr[nz];
arr[nz] = temp;

}


public static void  pushZero(int [] arr)
{
 int nz=0;
 for(int z=0;z<arr.length;z++)
 {
    if(arr[z]!=0)
    {
     swap(arr, nz, z);
     nz++;
    }
 }
}

public static int takeInput(String str)
{
System.out.println(str);
Scanner s = new Scanner(System.in);
int input = s.nextInt();
return input;
}

public static void main(String[] args) {
int cap = takeInput("Enter array capicity");
int arr[] = new int[cap];
for(int i =0;i<cap;i++)
{
  arr[i] = takeInput("Enter element :");
}

pushZero(arr); 

for(int i:arr)
{
    System.out.print(i + " ");
}

}
}
