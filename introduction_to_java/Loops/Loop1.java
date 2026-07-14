import java.util.Scanner;

public class Loop1 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int start = s.nextInt();
    int end = s.nextInt();
 for(int i =start ; i<=end;i++)
 {
    System.out.print(i);
    System.out.print(" ");
 }
 s.close();
}
}
