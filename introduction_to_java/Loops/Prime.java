import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    boolean isPrime =  false;
    for(int i = 2 ; i<n;i++)
    {
      if(n%i==0)
      {
        isPrime = false;
        break;
      }
      else
      {
        isPrime = true;
      }
    }

    if(isPrime==true)
    {
        System.out.println(n + " is a prime number");
    }
    else 
    {
        System.out.println(" not a prime number");
    }

    s.close();
    }
}
