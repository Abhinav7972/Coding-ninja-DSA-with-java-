public class HourGlass_pattern {
public static void main(String[] args) {
    int n=5;
   for(int i=1;i<=n;i++)
   {
    for(int s=1;s<=i-1;s++)
    {
        System.out.print(" ");
    }

    for(int j=i;j<=n;j++)
    {
        System.out.print(j + " ");
    }

    System.out.println();
    
   }



    for(int i=n-1;i>=1;i--)
   {
    for(int s=1;s<=i-1;s++)
    {
        System.out.print(" ");
    }

    for(int j=i;j<=n;j++)
    {
        System.out.print(j + " ");
    }

    System.out.println();
    
   }
}
}
