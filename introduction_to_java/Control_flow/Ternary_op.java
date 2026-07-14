import java.util.Scanner;

public class Ternary_op {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();

      int greater = n1>n2? (n1>n2?n1:n3): (n2>n3?n2:n3);

      System.out.println(greater + "is greater");
      s.close();
    }
}
