public class Insertion_sort {

public static void sort(int arr[])
{

for(int i=1; i< arr.length;i++)
{
int j = i-1; int temp = arr[i]; 

while (arr[j]>temp && j>=0) {
int tempswap = arr[j];
arr[j+1] = arr[j];
arr[j+1] = tempswap;
j--;
}   

arr[j+1] = temp;
}

}

    public static void main(String[] args) {
     int [] arr = {1,2,5,4,6,8,10,9};

     System.out.println("Array before sorting :");
     for(int i:arr)
     {
        System.err.print(i + " ");
     }
   
      System.out.println();
     sort(arr);
     
    System.out.println("Array after sorting :");
     for(int i:arr)
     {
      System.out.print(i+" ");
     }
    }
}
