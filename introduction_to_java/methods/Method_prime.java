public class Method_prime {
    public static void main(String[] args) {
        primePrint(10);
    }


   public static boolean isPrime(int num)
   {
    for(int i=2;i<=num/2;i++)
    {
      if(num%i==0)
      {
        return false;
      }
    }
    return true;
   }


    public static  void primePrint(int lim)
    {
     for(int i=2;i<=lim;i++)
     {
        if(isPrime(i))
        {
          System.out.println(i);
        }
     }

    }
}
