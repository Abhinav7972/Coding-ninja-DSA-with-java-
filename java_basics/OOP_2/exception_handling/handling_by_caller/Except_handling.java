
class Except_handling
{

    static int divideByzero(int a, int b) throws Divide_exception
    {
     if(b==0)
     {
        throw new Divide_exception();
     }

     return a/b;
    } 

    static int fact(int n) throws Invalid_num_exception
    {
      if(n<0)
      {
        throw new Invalid_num_exception();
      }

      int fact =1;

      for(int i=0;i<n;i++)
      {
        fact = fact *n;
      }

      return fact;
    }

    public static void main(String[] args) {

     try
     {
     fact(-1);
     divideByzero(10, 0);
     System.out.println("success");
     }
     catch(Divide_exception e)
     {
       System.out.println("divide by zero");
       e.printStackTrace();
     }
     catch(Invalid_num_exception e)
     {
      System.out.println("invalid number :");
       e.printStackTrace();
     }
     finally
     {
       System.out.println("finally block");
     }

     System.out.println("main block");
    }
}