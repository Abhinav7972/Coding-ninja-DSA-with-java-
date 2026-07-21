public class Method_call_stack {
    public static void main(String[] args) {
       int a=10;
       int b=30;
       printSum(a, b);
    }

    public static void printSum(int a,int b)
    {
       int add = sum(a, b);
       System.out.println(add);
    }


    public static int sum(int c,int d)
    {
        return c+d;
    }

}
