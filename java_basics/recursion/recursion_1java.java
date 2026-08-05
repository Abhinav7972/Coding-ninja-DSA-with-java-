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

    
public static void main(String[] args) {
 System.out.println(fact(5));
 System.out.println(sum(5));
 printnum(5);
 System.out.println();
 System.out.println(fibnum(10));
}
}