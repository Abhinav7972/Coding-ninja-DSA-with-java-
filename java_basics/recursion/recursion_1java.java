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


public static void main(String[] args) {
 System.out.println(fact(5));
 System.out.println(sum(5));
 printnum(5);
 System.out.println();
 System.out.println(fibnum(10));


 int arr[] = {1,2,3,4,5}; 

  System.out.println(isSorted(arr)); 
  System.out.println(isSortedBetter(arr,0));

}

}