//package introduction_to_java.methods;

public class Method_arg {

  public static void printDetails(String Fname,String Lname,int Acc_no)
  {
     System.out.println(Fname);
     System.out.println(Lname);
     System.out.println(Acc_no);
  }

   public static void main(String[] args) {
    printDetails("jhon", "Doe", 1234);
    System.out.println();
    printDetails("Lana", "Rhodes", 6969);

   }
}
