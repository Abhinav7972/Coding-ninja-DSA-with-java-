public class recursion_quick_sort {

public static int partition(int a[],int start,int end)
{
    int count = 0;
    int pivot = a[start];

    for(int i=start;i<end;i++)
    {
    if(a[i]<pivot)
    {
        count ++;
    }
    }

    int pivot_index = start + count; 

    int temp = a[pivot_index];
    a[pivot_index] = a[start];
    a[start] = temp; 

    int i =start; int j =end;

    while (i<pivot_index && j>pivot_index) {
        while (a[i]<pivot) {i++;}
        while (a[j]>=pivot) {j--;}

        if(i<pivot_index && j>pivot_index)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j++;
        }
    } 

    return pivot_index;

   
}

public static void Quick_sort(int a[],int start,int end)
{

if(a.length<=1)
{
    return;
}

if(start>=end)
{
    return;
}

int pivot_index = partition(a,start,end);

Quick_sort(a, start, pivot_index-1);
Quick_sort(a, pivot_index+1, end);

}

public static void main(String[] args) {
int arr[] = {1,2,4,5,7,8,6,9,10};

Quick_sort(arr, 0, arr.length-1);

for(int i:arr)
{
    System.out.print(i + " ");
}
}

}
