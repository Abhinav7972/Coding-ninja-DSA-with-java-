import java.util.Scanner;

public class Array_rotation_2 {

public static void reverse(int a[], int l,int r) {
  while (l<r) {
    int temp = a[l];
    a[l] = a[r];
    a[r] = temp;
    l++;
    r--;
  }
}



 public static void main(String[] args) {
    Scanner s  = new Scanner(System.in);

    System.out.print("Enter array capicity :");
    int len = s.nextInt();
    System.out.println();
    int a[] = new int[len];

    for(int i=0;i<len;i++)
    {
      a[i] = s.nextInt(); 
    }


    System.out.print("Enter 1 for right direction rotation and 0 for left :");
    int dir = s.nextInt();
    System.out.println();
    System.out.print("How many rotations ? :");
    int x = s.nextInt();
    
    x= x%len;

    if(dir==1)
    {
        //right rotation by x
        reverse(a,0,len-1);  // full array reverse
        reverse(a, 0, x-1);  //reverse from  0 to  rotation index -1
        reverse(a, x, len-1);  //reverse from rotation index to array length -1
    }
    else 
    {
        //left rotation by x
        reverse(a, 0, x-1); // reverse from index 0 to rotation index -1
        reverse(a,x, len-1);  //reverse from rotation index to  array length -1
        reverse(a, 0, len-1); //full array reverse 
    }


    for(int i:a)
    {
        System.out.print(i + " ");
    }
 }
}
