public class Array_reverse {

 public static void swap(int A[],int l,int r)
 {
   int temp = A[l];
   A[l] = A[r];
   A[r] = temp;
 }  

public static  void reverse(int [] A)
{
int l =0;
int r = A.length-1;

while (l<r) {
 swap(A, l, r);
 l++;
 r--;
}

}


 public static void main(String[] args) {
    int A[] = {1,2,3,4};
    
   
    System.out.println("Array beforr swap");
    for(int i:A)
    {
        System.out.print(i);
    }

    
    System.out.println();
    System.out.println("Array after swap");

    reverse(A);
    
    for(int i:A)
    {
        System.out.print(i);
    }
 }
}
