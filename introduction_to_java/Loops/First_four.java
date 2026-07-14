import java.util.Scanner;

public class First_four {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.print("Enter range :");
int n = s.nextInt();

System.out.print("How many even number you want ? :");
int even_no = s.nextInt();

for(int i = 1 ; i<=n;i++)
{
    if(i%2==0)
    {
         if(even_no>0)
    {
      System.out.println(i);
      even_no--;
    }
    }

   
}

s.close();
}
}
