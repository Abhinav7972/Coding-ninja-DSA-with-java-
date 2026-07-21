public class Method_overloading {
public static void main(String[] args) {
 sum(2,2,3);
 sum(1,2);
 sum(2, 2.2);
}

public static void sum(int a, int b)
{
    System.out.println(a+b);
}


public static void sum(int a, int b,int c)
{
    System.out.println(a+b+c);
}

public static void sum(int a, double b)
{
    System.out.println(a+b);
}

}
