import java.util.Scanner;
public class Square_pattern_num {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i =1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        System.out.print(i); //111 2222 3333
        
      }
      System.out.println();
    }

    System.out.println();

     for(int i =1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        System.out.print(j); //123 123 123
      
      }
      System.out.println();
    }



     System.out.println();
    
     for(int i =1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        System.out.print(n-j+1); //123 123 123
      
      }
      System.out.println();
    }


    s.close();
}
}
