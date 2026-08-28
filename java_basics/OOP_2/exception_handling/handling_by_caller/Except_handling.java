
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

    public static void main(String[] args) {

     try
     {
     divideByzero(10, 0);
     System.out.println("success");
     }
     catch(Divide_exception e)
     {
       System.out.println("divide by zero");
       e.printStackTrace();
     }

     System.out.println("main block");
    }
}