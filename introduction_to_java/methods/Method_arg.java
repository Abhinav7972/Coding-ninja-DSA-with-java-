//package introduction_to_java.methods;

public class Method_arg {

  public static void printDetails(String Fname,String Lname,int Acc_no)
  {
     System.out.println("Name :" +Fname);
     System.out.println("Last-name :"+Lname);
     System.out.println("Account-number :" + Acc_no);
  }

   public static void main(String[] args) {
    printDetails("jhon", "Doe", 1234);
    System.out.println();
    printDetails("Lana", "Rhodes", 6969);

   }
}
