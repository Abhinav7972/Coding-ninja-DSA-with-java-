public class Selection_sort {

    public static void sort(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
        int min =i; 
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min]) 
            {
              min =j;
            }
        } 

        int temp = arr[min];
        arr[min] = arr[i]; 
        arr[i] = temp;
       }
    }

public static void main(String[] args) {
int arr[] = {2,3,4,6,1};

System.out.println("Array before sort :");
for(int i:arr)
{
    System.out.print(i+" ");
}


sort(arr);

System.out.println();

System.out.println("Array after sort :");
for(int i:arr)
{
    System.out.print(i+" ");
}
}
}
