
public class Bubble_sort {
public static void sort(int arr[])
{
 for(int i=0;i<arr.length-1;i++)
 {//outer loop for passes
    for(int j=0;j<arr.length-1-i;j++)
    {
       if(arr[j]>arr[j+1])
       {
         int temp = arr[j];
         arr[j] = arr[j+1];
         arr[j+1] = temp;
       }
    }
 }
}


public static void main(String[] args) {
int arr[] = {1,2,5,4,3,10,20,14};

System.out.println("Array before sort :");

for(int i:arr)
{
    System.out.print(i + " ");
}

System.out.println();
sort(arr);

System.out.println("Array after sort :");
for(int i:arr)
{
    System.out.print(i + " ");
}

}
}
