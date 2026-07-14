import java.util.*;
public class Scholarship_test {
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);


  System.out.print("Enter your scholarship exam marks :");
  int scholarshipExam = s.nextInt();
  System.out.print("Enter GPA :");
  float gpa = s.nextFloat();
  System.out.print("Enter sports star :");
  float sport_star = s.nextFloat();
   
  if((gpa>=3.5 || sport_star>=3) && scholarshipExam >=65)
  {
    System.out.println("Congrats eligible for scholarship!!");
  }
  else
  {
    System.out.println("we are sorry you are not eligible!");
  }
  
  
  s.close();
}
}
