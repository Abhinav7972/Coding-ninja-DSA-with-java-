import java.util.Scanner;
public class Method_combination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter total number :");
        int Totaln = s.nextInt();
        System.out.print("Enter selected number :");
        int Selectn = s.nextInt();

        if(Totaln<=0||Selectn<=0||Selectn>Totaln)
       {
        System.out.println("Ensure numbers are positive and  selected number should not be greater than total number");
       }
       else 
       {
        System.out.println("Total combinations are :" + combination(Totaln, Selectn));
       }
        s.close();
    }
 
     public static int combination(int n,int r)
     {

      

        int factN = fact(n);
        int factR = fact(r); 
        int factNMR = fact(n-r);

        int c = factN/(factR*factNMR);

       return c;
     }



    public static int fact(int n)
    {
     int fact = 1;
      for(int i=1;i<=n;i++)
      {
        fact*=i;
      }

      return fact;
    }
}
