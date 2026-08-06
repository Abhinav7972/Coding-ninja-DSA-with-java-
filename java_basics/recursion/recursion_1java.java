public class recursion_1java 
{
public static int fact(int n)
{
    if(n==0)
    {
        return 1;
    }
    int smallop = fact(n-1); 

    int output  = n * smallop; 

    return output;
}   

public static int sum(int n)
{
    if(n==0)
    {
        return 0;
    }

    int smallop = sum(n-1);

    int output = n + smallop;

    return output;
}


public static void printnum(int n)
{
if(n==0)
{
    return;
} 

printnum(n-1);
System.out.print(n+" ");
}


public static int fibnum(int n)
{
if(n==1 || n==2)
{
 return 1;
} 

int fib_n1 = fibnum(n-1);
int fib_n2 = fibnum(n-2); 
int fib = fib_n1+fib_n2;

return fib;


}


public static boolean isSorted(int arr [])
{

  if(arr.length==1)
  {
    return true;
  } 

  if(arr[0]>arr[1])
  {
    return false;
  }

int smallArray [] = new int[arr.length-1];

for(int i=1;i<arr.length;i++)
{
smallArray[i-1] = arr[i];
} 

boolean isSmallSorted =  isSorted(smallArray); 

return isSmallSorted;
}


public static boolean isSortedBetter(int [] arr,int si)
{
if(si==arr.length-1)
{
 return true;
}

if(arr[si]>arr[si+1])
{
    return false;
}

boolean isSorted = isSortedBetter(arr,si+1);  

return isSorted;
}


public static int findIndex(int arr[],int x)
{
    if(arr.length==0)
    {
        return -1;
    }

    if(arr[0]==x)
    {
        return 0;
    }
    
    int smallArray[] = new int[arr.length-1]; 

    for(int i=1;i<arr.length;i++)
    {
        smallArray[i-1] = arr[i];
    }

    int find = findIndex(smallArray, x);

    if(find== -1)
    {
        return -1;
    }
    else 
    {
        return find+1;
    }

}


public static int findIndexBetter(int arr[],int x,int startIndex)
{
if(startIndex == arr.length)
{
    return -1;
} 

if(arr[startIndex]==x)
{
    return startIndex;
}

int find =  findIndexBetter(arr, x, startIndex+1); 

return find;

} 


public static int findLastindex(int[] arr,int x)
{
if(arr.length==0)
{
    return -1;
}

int smallArray[] = new int[arr.length-1]; 

for(int i=1;i<arr.length;i++)
{
   smallArray[i-1] = arr[i];
}

int k = findLastindex(smallArray,x); 

if(k!=-1)
{
    return k+1;
}
else 
{
    if(arr[0]==x)
    {
        return 0;
    }
    else 
    {
        return -1;
    }
}

}


public static int findLastindexBetter(int [] a, int x, int si)
{
if(si==a.length)
{
    return -1;
}

int k =  findLastindexBetter(a, x, si+1);

if(k!=-1)
{
    return k;
}
else 
{
    if(a[si]==x)
    {
        return si;
    }
    else 
    {
        return -1;
    }
}
}


public static void main(String[] args) {
 System.out.println(fact(5));
 System.out.println(sum(5));
 printnum(5);
 System.out.println();
 System.out.println(fibnum(10));


 int arr[] = {1,2,3,4,5}; 
 int arr2[] = {1,2,3,4,5,2};

  System.out.println(isSorted(arr)); 
  System.out.println(isSortedBetter(arr,0));
 System.out.println(findIndex(arr, 2));
 System.out.println(findIndexBetter(arr, 10, 0));

 System.out.println(findLastindex(arr2, 2)); 
 System.out.println(findLastindexBetter(arr2, 2, 0));

}

}