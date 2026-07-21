public class Method_overloading_2 {
public static void main(String[] args) {
 sum(1, 2.2);
 sum(2,2);
 sum(5.5f, 2.2f);
}

public static void sum(int a,int b)
{
    int sum = a+b;
    System.out.println("Sum of integer :"+sum);
}

public static void sum(double a, double b)
{
    double sum = a+b;
    System.out.println("Sum of double :"+sum);
}

public static void sum(float a, float b)
{
    float sum = a+b;
    System.out.println("sum of float :" + sum);
}



}
