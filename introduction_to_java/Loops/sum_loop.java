import java.util.Scanner;
public class sum_loop {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("how many number you want to add ? :");
    int n = s.nextInt();
    int  sum = 0;
    for(int i =1 ; i<=n;i++)
    {
      sum+=i;
      System.out.println(sum);
    }

    System.out.println("sum of "+n+" number is "+sum);

    s.close();
 }
}
