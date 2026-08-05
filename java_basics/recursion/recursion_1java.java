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


    
public static void main(String[] args) {
 System.out.println(fact(5));
}
}