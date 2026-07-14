import java.util.Scanner;

public class Score {
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

 System.out.print("Enter marks :");
 int marks = s.nextInt();

 if(marks>=90)
 {
    System.out.println("A+");
 }
 else if (marks>=80) {
  System.out.println("A");
 }
 else if(marks>=70)
 {
   System.out.println("B");
 }
 else 
 {
    System.out.println("passed");
 }

 s.close();
}
}
