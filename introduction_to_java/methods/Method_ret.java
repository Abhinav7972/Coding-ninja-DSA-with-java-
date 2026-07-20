//package introduction_to_java.methods;

public class Method_ret {

  
  public static void main(String[] args) {
     int square = square(2);

     System.out.println(square *2);
  }


    public static int square(int n)
    {
        int  sq = n*n;

        return sq;
    }
}
