import java.util.Scanner;

public class User_input_percent {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter total marks");
    float totalMarks = s.nextFloat();
    System.out.println("Enter score ");
    int score =  s.nextInt();
    double percentage = (score / totalMarks) * 100;
      
    System.out.println(percentage + "%");
    s.close();

}
}
