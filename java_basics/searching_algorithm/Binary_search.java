import java.util.Scanner;

public class Binary_search {
 public static int search(int arr[],int key)
 {
int left =0,right=arr.length-1;

while(left<=right)
{
int mid = left + (right-left)/2; 

    if(arr[mid]==key)
    {
       return mid;
    }
    else if(arr[mid]<key)
    {
      left=mid+1;
    }
    else 
    {
        right =mid-1;
    }
}

 return -1;
 }


 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  int arr[] = {1,2,3,4,5,6,7,8}; 
  int n = sc.nextInt(); 
  int result = search(arr, n);
  System.out.println(result);
  sc.close();
 }
}
