import java.util.Scanner;

public class Method_pass_val {


    public static int add(int n1, int n2,int n3)
    {
        n1++;
        System.out.println("n1 before call :"+n1);
        //these value is not same  after calling method
       //int sum = n1+n2 + n3;
       //return sum;
       return n1+n2+n3;
    }
 public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n1= s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();


      //int result = add(n1, n2, n3);
      System.out.println("n1 after call :"+n1);
      System.out.println(add(n1, n2, n3));

      s.close();
 }
}
