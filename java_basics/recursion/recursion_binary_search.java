public class recursion_binary_search {

public static int binarySearch(int a[],int si,int ei,int x)
{

if(si>ei)
{
    return -1;
}


int midIndex = si + (ei-si)/2;

if(a[midIndex]==x)
{
    return midIndex;
}

if(a[midIndex]<x)
{
    return binarySearch(a,midIndex+1,ei,x); 
}
else 
{
 return binarySearch(a,midIndex-1,ei,x);
}

}


public static void main(String[] args) {
int arr [] = {1,2,3,4}; 

System.out.println(binarySearch(arr, 0, arr.length-1, 4));
}
}
