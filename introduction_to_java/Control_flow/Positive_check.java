import java.util.Scanner;

public class Positive_check {
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);

   System.out.print("Enter your number :");
   int num = s.nextInt();
  
   if(num>0)
   {
    System.out.println("number is positive");
   }
   else
   {
    System.out.println("number is negative");
   }

   s.close();
}
}
